console.log('y starts');
exports.done = false;
let x = require('./x.js');
console.log('in y x.done '+x.done);
exports.done = true;
console.log('y ends');