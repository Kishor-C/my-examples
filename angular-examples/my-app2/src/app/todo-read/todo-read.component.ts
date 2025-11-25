import { Component, inject, OnInit } from '@angular/core';
import { TodoService } from '../todo.service';

@Component({
  selector: 'app-todo-read',
  standalone: false,
  templateUrl: './todo-read.component.html',
  styleUrl: './todo-read.component.css'
})
export class TodoReadComponent implements OnInit{
  todo = inject(TodoService);
  tasks !: any;
  ngOnInit(): void {
      this.tasks = this.todo.getItems();
  }
  deleteAllTasks() {
    this.todo.clear();
  }
  refresh() {
    this.ngOnInit();
  }
}
