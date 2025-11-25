import {interval, Observable, take, from, Subject} from 'rxjs';
import process from 'process';

import { BehaviorSubject } from 'rxjs';
import { ReplaySubject } from 'rxjs';

// ReplaySubject with buffer size of 3
const chatSubject = new ReplaySubject(3);

// Emit some messages
chatSubject.next('Message 1: Hello!');
chatSubject.next('Message 2: How are you?');
chatSubject.next('Message 3: What’s up?');
chatSubject.next('Message 4: Let’s go!');

// Subscriber 1 joins and receives all the messages in the buffer size
chatSubject.subscribe(msg => console.log('Subscriber 1:', msg));

// Subscriber 2 joins later, and will receive the last 3 messages
setTimeout(() => {
  chatSubject.subscribe(msg => console.log('Subscriber 2:', msg));
}, 2000);

// Emit another message
setTimeout(() => {
  chatSubject.next('Message 5: We are live!');
}, 3000);

// const subject = new BehaviorSubject('Initial value'); // default value

// subject.subscribe(value => console.log('Subscriber 1:', value)); // Logs: "Subscriber 1: Initial value"
// subject.next('New value1');
// subject.next('New value2');
// subject.next('New value3');

// subject.subscribe(value => console.log('Subscriber 2:', value)); // Logs: "Subscriber 2: New value"
// subject.next('Another value');


// Observable vs Subject

// let ott = new Observable(observer=>{
//     observer.next('Movie started at: '+new Date().toTimeString())
// });

// ott.subscribe({next: v => console.log(v)});
// setTimeout(()=>{
//     ott.subscribe({next: v => console.log(v)});
//     console.log("********************");
// }, 5000);


// let liveFeeds = new Subject();
// setTimeout(()=>{
//     liveFeeds.next("Message2 sent at: "+new Date().toTimeString());
// }, 1000);
// setTimeout(()=>{
//     liveFeeds.next("Message1 sent at: "+new Date().toTimeString());
// }, 500);
// liveFeeds.subscribe({next : v => console.log('Live Feeds without timeout: ',v)});
// setTimeout(()=>{
//     liveFeeds.subscribe({next: v => console.log('Live Feeds with timeout: ',v)})
// }, 200);



// let subscriber = new Observable(publish=>{
//     publish.next("HELLO WORLD");
// });

// subscriber.subscribe({
//     next: (value) => console.log(`Value1 = ${value}`)
// })
// subscriber.subscribe({
//     next: (value) => console.log(`Value2 = ${value}`)
// })

// let subject = new Subject();

// setTimeout(()=>{
//     subject.next(1);
//     subject.next(2);
// }, 5000);

// subject.subscribe({next: v=>console.log(v)});
// subject.subscribe({next: v=>console.log(v)});
// subject.subscribe({next: v=>console.log(v)});
// subject.subscribe({next: v=>console.log(v)});

// subject.next(33);


// let timer = interval(1000);

// timer.pipe(take(2)).subscribe({
//     next : (value) => console.log('value:', value),
//     error : (error) => console.log('error:', error),
//     complete : () => console.log('completed')
// });

// let timer = interval(1000);
// //clearInterval(timer);

// timer.subscribe({
//     next : data => console.log('next: ',data),
    
// });

// let count = 0;
// let messages = ["Hello", "Hi", "See you", "Tomorrow", "Bye!"];

// const myObservable = new Observable(observer => {
//     const intervalId = setInterval(()=>{
//         if(messages[count] == undefined) {
//             observer.complete();
//         }
//         observer.next(messages[count]);
//         count++;

//     }, 2000);
//     return () => {
//         console.log('cleaning up');
//         clearInterval(intervalId);
//     };
//   });
 

//   setTimeout(()=>{
//     //console.log('subscriber1 leaving the chat');
//     //subscriber1.unsubscribe();
//     //process.exit();
//   }, 3000);

