import net from 'net';

let server = net.createServer((client) => {
    client.on('data', (data) => {
        console.log("____ Client sent data ____")
        console.log(data);
        console.log(data.toString());
    });
    client.write('hello client welcoem')
    client.on('end', () => console.log('Client disconnected!'))
});

server.listen(8888, () => console.log('tcp server started at 8888'))
