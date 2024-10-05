
setInterval(()=>{
    //setTimeout(()=>console.log('setTimeout'),1000)
    setImmediate(()=>console.log('setImmediate'));
    process.nextTick(()=>console.log('process.nextTick'));
    console.log('______________________');
}, 1000);