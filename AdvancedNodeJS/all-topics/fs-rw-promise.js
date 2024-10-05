import fs from 'fs/promises';

// writing file with promise based write
fs.writeFile('helloworld.txt', 'Hello Everyone\n', {flag: 'a+'})
.then(() => console.log(`File written`))
.catch(error => console.log(`Error: ${error}`));

// reading file with promise based read
fs.readFile('helloworld.txt')
.then(value => console.log(value.toString()))
.catch(error => console.log(error))