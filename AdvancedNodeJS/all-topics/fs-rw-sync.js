import fs from 'fs';

// performing a write synchronously with append on.
fs.writeFileSync('helloword.txt', 'Hello Everyone\n', {flag : 'a+'});

// performing a read asynchronously
let buffer = fs.readFileSync('helloword.txt');
console.log(buffer.toString());