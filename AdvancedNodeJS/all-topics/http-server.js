import http from 'http';
import url from 'url';

// create server
let server = http.createServer((request, response) => {
    let urlString = request.url;
    let urlObject = url.parse(urlString, true);
    let query = urlObject.query;
    // writes the chunk of data
    response.write(`Hello ${query.name} `);
    response.write('Thank you for visiting.');
    response.end();
});

server.listen(9999, () => console.log('Server is running at 9999'))