let net = require('net');
let readline = require('readline-sync');
let message = '';
let client = new net.Socket();
client.connect(8000, 'localhost', () => {
	console.log('Connected...');
    do {
        message = readline.question('Enter your message: ');
        client.write(message);
    }while(message != 'quit');
    client.destroy();
});

client.on('close', function() {
	console.log('Connection closed...');
});