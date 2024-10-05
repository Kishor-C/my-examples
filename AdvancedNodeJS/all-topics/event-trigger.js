import EventEmitter from "events";

let eventEmitter = new EventEmitter();

// handling the event 'start' with different parameters
eventEmitter.on('start', () => console.log(`Start event emited without a value`))
eventEmitter.on('start', (value) => console.log(`Start event emited with a value: ${value}`))
eventEmitter.on('start', (...value) => console.log(`Start event emited multiple values: ${value}`));
// handling the event 'error' with a parameter
eventEmitter.on('error', (err) => console.log(`Error: ${err}`));
setTimeout(() => {
    // all the event handlers will be executed in the order they are executed
    eventEmitter.emit('start', 25, 30);
    try {
        throw 'Resource not found';
    } catch(err) {
        eventEmitter.emit('error', err);
    }
}, 2000);
