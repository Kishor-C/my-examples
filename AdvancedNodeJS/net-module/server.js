let net = require('net');
let clients = 0;

// creates a TCP server & listens to the client
let server = net.createServer(client => {
  clients++;
  let clientId = clients;
  console.log('Client connected: ');
  // waits for client to disconnect
  client.on('end', () => console.log(`Client disconnected: ${clientId}`));
  // sends data to the client
  client.write('Welcome client: '+clientId+' rn');
  // wait for client to send the data
  client.on('data', data => console.log(data.toString()))
});
// start the TCP server
server.listen(8000, () => console.log('Server started on port 8000'));