import mysql from "mysql2/promise";
import express from "express";
let app = express();
let connection = undefined;

try {
  connection = mysql.createPool({
    host: "localhost",
    user: "root",
    password: "root",
    database: "mydb",
    port: 3306,
    waitForConnections: true,
    connectionLimit: 10,
    maxIdle: 10, // max idle connections, the default value is the same as `connectionLimit`
    idleTimeout: 10000, // idle connections timeout, in milliseconds, the default value 60000
    queueLimit: 0,
    enableKeepAlive: true,
    keepAliveInitialDelay: 0,
  });
} catch (err) {
  console.log(err);
}
app.use(express.json());

app.get("/profiles", async (request, response) => {
  const [result, fields] = await connection.execute("select * from profile");
  response.json(result);
});

app.get("/profiles/:id/contacts", async (request, response) => {
  let profileId = request.params["id"];
  const [result, fields] = await connection.execute(
    "select *  from profile where id = ?",
    [profileId]
  );
  const [contacts, fields2] = await connection.execute(
    "select * from contact where pid = ?",
    [profileId]
  );
  result[0].contactList = contacts;
  response.json(result[0]);
});

app.post("/profiles", async (request, response) => {
  let profile = request.body;
  const [result, fields] = await connection.execute(
    "insert into profile(name,dob,phone) values(?,?,?)",
    [profile.name, profile.dob, profile.phone]
  );
  response.json(result);
});

app.listen(8888, () => console.log("server is running at 8888 port"));
