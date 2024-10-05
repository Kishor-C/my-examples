import express from "express";
import cors from "cors";

let app = express();

app.use(cors());
app.use(express.json());
app.listen(8888, () => console.log(`Server is running at 8888 port`));

app.get("/login", (request, response) => {
  let auth = request.headers.authorization;
  let authString = auth.split(" ");
  let base64 = Buffer.from(authString[1], "base64");
  let decode = base64.toString();
  let decodeArray = decode.split(":");
  let username = decodeArray[0];
  let password = decodeArray[1];

  response.json({
    message: "Hello " + username + ", your password: " + password,
  });
});
