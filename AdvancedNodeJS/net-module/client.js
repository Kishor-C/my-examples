let net = require('net');

let client = new net.Socket();
client.connect(8000, 'localhost', () => {
	console.log('Connected');
	// send some data to the server
	client.write('Hello, server! Love, Client.');
});

client.on('data', (data) => {
	console.log('Received: ' + data);
	client.destroy(); // kill client after server's response
});

client.on('close', () => {
	console.log('Connection closed');
});