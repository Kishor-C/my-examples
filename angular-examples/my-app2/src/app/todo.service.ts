import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  constructor() { }

  getItems() {
    let db : any = localStorage.getItem('tasks');
    return (db != null) ? JSON.parse(db) : [];
  }
  
  addTask(task : any) {
    let db : any = this.getItems();
    db.push(task);
    localStorage.setItem('tasks', JSON.stringify(db));
  }
  clear() {
    localStorage.clear();
  }
}
