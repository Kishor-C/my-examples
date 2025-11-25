const express = require("express");
const app = express();
const webpush = require('web-push');
const cors = require("cors")
const port = 3000;
app.use(cors());
app.use(express.json());

const subDatabse = [];
const apiKeys = { 
    pubKey: "BFTtyOO5cqDJZvuLQ_z4Y_RIX0QafdU82FzXpAB5TDrbISGnt3lhZCbutZCNgDKkTxc4SfxvaSABi0QcQurdPOc", 
    privKey: "N_tdS_Bzk6ONX7r3-HejvOFN2yKqokiAkirYA5L_zB8" 
}

webpush.setVapidDetails('mailto:kishor1124@gmail.com', apiKeys.pubKey, apiKeys.privKey)

app.get("/", (req, res) => res.send("Hello world"))

app.post("/save-subscription", (req, res) => {
    subDatabse.push(req.body);
    res.json({ status: "Success", message: "Subscription saved!" })
})

app.get("/send-notification", (req, res) => {
    webpush.sendNotification(subDatabse[0], "Hello world");
    res.json({ "statue": "Success", "message": "Message sent to push service" });
})

app.listen(port, () => {
    console.log("Server running on port 3000!");
})