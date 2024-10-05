import net from 'net';


let client = new net.Socket();

client.connect(8888, 'localhost', () => {
    client.write('Hello TCP I am client.');
});
client.on('data', (data)=>{
    console.log(data);
    client.destroy();
})
client.on('close', () => {
    console.log('closed connection');
})