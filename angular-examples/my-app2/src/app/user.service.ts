import { Injectable } from '@angular/core';
import { User, USERS } from './mock/users';
import { interval, map, Observable, take} from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  async getUsers3() : Promise<any> {
    let URL = "https://jsonplaceholder.typicode.com/users";
    let partial = await fetch(URL);
    let json = await partial.json();
    return json;
  }

  getUsers() : Observable<User> {
    return new Observable((observer)=>{
      USERS.forEach(item => observer.next(item));
      let counter = 0;
      const timerId = setInterval(()=>{
        counter++;
        observer.next({userId:999+counter, name : "Alex"+counter, dob : "2000-10-20"})
      }, 1000) 
      // below code is executed when unsubscribe() is called on this observable
      return () => {console.log('unsubscribing'); clearInterval(timerId)}
    })
  }

  getUsers2(): Observable<User> {
    return interval(1000).pipe(
      map((count) => {
        return {
          userId: 100 + count + 1, // +1 so starts from 1000
          name: "Alex" + (count + 1),
          dob: "2000-10-20"
        } ;
      })
    );
  }
}
