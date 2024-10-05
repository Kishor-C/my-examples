console.log('x starts');
exports.done = false;
let y = require('./y.js');
console.log('in x y.done '+y.done);
exports.done = true;
console.log('x ends');