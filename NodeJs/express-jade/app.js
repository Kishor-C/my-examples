import express from "express";

let app = express();

app.set("view engine", "pug");

app.get("/", (req, res) => {
  res.render("index", { title: "Hey", message: "Hello there" });
});

app.listen(8080, () => console.log("server running in 8080"));
