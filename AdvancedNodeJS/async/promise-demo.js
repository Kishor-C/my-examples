let p = new Promise((resolve, reject) => {
    // if queury executes
    let random = Math.random();
    console.log(random);
    if(random >= 0.5) {
        resolve({response: {data: "Hello I got result"}});
    } else {
        reject({response: {error: "Failed to fetch the result"}})
    }
})
p.then(value => console.log(value))
.catch(error => console.log(error))
.finally(() => console.log('async work is done'))
