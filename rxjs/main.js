import { Observable, map, filter, Subject } from "rxjs";

//Observable vs Subject

// let ott = new Observable(observer=>{
//     observer.next('Movie started at: '+new Date().toTimeString())
// });

// ott.subscribe({next: v => console.log(v)});
// setTimeout(()=>{
//     ott.subscribe({next: v => console.log(v)});
//     console.log("********************");
// }, 5000);


let liveFeeds = new Subject();
liveFeeds.subscribe({next : v => console.log('Sub1: ',v)}); // subscribed before publish
liveFeeds.next("Message sent to all the subscribers");//will be recieved by one subscriber
setTimeout(()=>{
    liveFeeds.subscribe({next: v => console.log('Sub2: ',v)})
}, 60); //subscribing after 60ms

setTimeout(()=>{
    liveFeeds.next("Message2 sent at: "+new Date().toTimeString());
}, 500); // publishes the date, all subscribers recieve same date




