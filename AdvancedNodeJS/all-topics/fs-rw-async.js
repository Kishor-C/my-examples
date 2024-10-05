import fs from 'fs';

// performing a write synchronously with append on.
fs.writeFile('helloword.txt', 'Hello Everyone\n', {flag : 'a+'}, (err) => {
    if(!err) {
        console.log('file is written...')
    }
});

// performing a read asynchronously
fs.readFile('helloword.txt', (error, data) => {
    if(!error) {
        console.log(data.toString());
    } else {
        console.log(error);
    }
});
