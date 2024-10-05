import http from 'http';

let server = http.createServer((request, response) => {
    if(request.url == '/') {
        response.end('Main page');
    } else if(request.url == '/slow-page') {
        // Simulate CPU work
        for(let i = 1; i <= 5000000000; i++) {}
        response.end('Slow page');
    }
});

server.listen(8888, () => console.log('Server started in 8888...'))