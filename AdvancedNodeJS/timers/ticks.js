console.log('Hello => number 1');

process.nextTick(() => {
    console.log('next tick running => number 2');

});
setTimeout(() => {
    console.log('timeout running  => number 3');
}, 0);
console.log('Hello => number 4');

