console.log('b module starts');
exports.done = false;
/*cyclic: because main.js loads a.js, then a.js loads b.js, at this point
b.js tries to load a.js, however it doesn't because it will be in infinite loop,
here node.js will prevent this infinite loop by returning the unfinished copy
of the a.js exports object to b.js
 inorder to prevent an infinite loop, cyclic, 
 unfinished copy of a.js exports object is returned
*/
 let a = require('./a.js'); 
console.log(`in b, a.done = ${a.done}`);
exports.done = true;
console.log('b module ends');

