import express from 'express';
import http from 'http';
import {Server} from 'socket.io';


let app = express();
let server = http.createServer(app);
let io = new Server(server);

app.get('/', (request, response) => {
    response.sendFile('index.html', {root: 'D:\\Training Stuffs\\MyExamples\\NodeJs\\socketio'})
});

io.on('connection', (socket) => {
    socket.on('obj', msg => console.log(msg));
    socket.emit('obj1', 'Hi this is server message');
});
server.listen(9999, () => console.log('server running 9999'));