import { MongoClient } from "mongodb";

let url = "mongodb://127.0.0.1:27017";

// reusable connection
async function establishConnection(dbURL) {
  return await MongoClient.connect(dbURL);
}
// storing the document
export async function store(doc) {
  let client = null;
  try {
    client = await establishConnection(url);
    let db = client.db("hellodb");
    return await db.collection("profiles").insertOne(doc);
  } catch (err) {
    console.log(err);
    throw err;
  } finally {
    client.close();
  }
}
// finding the document by id

export async function findById(id) {
  let client = null;
  try {
    client = await establishConnection(url);
    let db = client.db("hellodb");
    return await db.collection("profiles").findOne({ _id: id });
  } catch (err) {
    console.log(err);
    throw err;
  } finally {
    client.close();
  }
}
// find all the documents

export async function findAll() {
  let client = null;
  try {
    client = await establishConnection(url);
    let db = client.db("hellodb");
    return await db.collection("profiles").find().toArray();
  } catch (err) {
    console.log(err);
    throw err;
  } finally {
    client.close();
  }
}
// update the document by id
export async function update(id, doc) {
  let client = null;
  try {
    client = await establishConnection(url);
    let db = client.db("hellodb");
    return await db
      .collection("profiles")
      .updateOne({ _id: id }, { $set: doc });
  } catch (err) {
    console.log(err);
    throw err;
  } finally {
    client.close();
  }
}

// read the document based on name and phone
export async function login(nameR, phoneR) {
  let client = null;
  try {
    client = await establishConnection(url);
    let db = client.db("hellodb");
    return await db
      .collection("profiles")
      .findOne({ name: nameR, phone: phoneR });
  } catch (err) {
    console.log(err);
    throw err;
  } finally {
    client.close();
  }
}

// Testing CRUD
// store({ _id: 5, name: "Kishor5", phone: 5555 })
//   .then((res) => console.log(res))
//   .catch((err) => console.log(err));

// findById(2)
//   .then((result) => console.log(result))
//   .catch((err) => console.log(err));

// findAll()
//   .then((result) => console.log(result))
//   .catch((err) => console.log(err));

// update(4, { phone: 44444 })
//   .then((result) => console.log(result))
//   .catch((err) => console.log(err));

// login("Kishor4", 44444)
//   .then((result) => console.log(result))
//   .catch((err) => console.log(err));
