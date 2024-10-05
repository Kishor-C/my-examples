console.log('main module starts');
let a = require('./a.js');
let b = require('./b.js');
console.log(`in main a.done = ${a.done}, b.done = ${b.done}`);