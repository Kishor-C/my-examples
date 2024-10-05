let fs = require('fs');

console.log('Hello => number 1');
fs.readFile('readme.txt', (err, data) => {
    if(err) {
        console.log(err);
    }
    console.log(data);
    setTimeout(() => console.log('setTimeout => 1'), 0)
    setImmediate(() => console.log('setImmedate => 2'));
});

process.nextTick(() => {
    console.log('process.nextTick => number 4')
});