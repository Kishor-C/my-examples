import { Observable } from "rxjs"

const first5Numbers = new Observable((obs) => {
  console.log("hello!")
  for (let i = 0; i < 5; i++) {obs.next(i); if(i == 3) throw 'something went wrong'}
  obs.complete()
})
// Logs nothing

first5Numbers.subscribe((n) => {
  console.log(n)
})
// Logs "hello!" followed by 0 1 2 3 4

console.log("_____________");

first5Numbers.subscribe({
  next : (item)=>console.log(item),
  error: (err) => console.log('error occured: ', err),
  complete : () => console.log('completed')
})