
let net = require('net');
// to track the clients
let clients = 0;
let server = net.createServer(client => {
    clients++;
    let clientId = clients;
    client.on('end', () => console.log(`Client disconnected: ${clientId}`));
    client.on('data', data => console.log(data.toString()))

});
server.on('connection', (socket) => console.log(`Some one connected: ${socket.remotePort + socket.remoteAddress}`))
server.listen(8000, () => console.log('Server started on port 8000'));
