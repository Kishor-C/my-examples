import https from 'https';
import fs from 'fs';

let options = {
    key : fs.readFileSync(''),
    cert: fs.readFileSync('')
}

// create server
let server = https.createServer(options, (request, response) => {
    response.write('Hello https');
    response.end();
});

server.listen(9999, () => console.log('Server is running at 9999'))