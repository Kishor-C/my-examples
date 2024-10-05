import express from 'express';

let app1 = express();
let app2 = express();

const handle = serverName => (req, res) => {
    console.log(`Request from ${serverName}, method : ${req.method}, url: ${req.url}`);
    res.send(`Hello from ${serverName}`)
}

app1.get('*', handle(1)).post('*', handle(1));
app2.get('*', handle(2)).post('*', handle(2));

app1.listen(3000, console.log('started in 3000'));
app2.listen(3001, console.log('started in 3001'));

