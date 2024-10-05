console.log('a module starts');
exports.done = false;
let b = require('./b.js');
console.log(`in a, b.done = ${b.done}`);
exports.done = true;
console.log('a module ends');