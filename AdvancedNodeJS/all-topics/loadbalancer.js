import request from 'request';
import express from 'express';

// list of applications running in different port
let servers = ['http://localhost:3000', 'http://localhost:3001'];
// counter to track to which server the request must be sent
let current = 0;
// handler to take all the incoming request to the loadbalancer
const handler = (req, res) => {
    // select the server to forward the request
    const server = servers[current];

    req.pipe(request({url: server+req.url})).pipe(res);

    // update the current server to be 0 or 1
    current = (current + 1) % servers.length;
}
const lbServer = express();
// handle favicon
lbServer.get('/favicon.ico', (req, res) => {res.send('./favicon.ico')});
// pass the request to handler method
lbServer.use((req, res) => {handler(req, res)});
lbServer.listen(9999, () => console.log('load balancer started in 9999'))