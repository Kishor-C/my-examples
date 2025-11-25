import { Component, inject, OnInit } from '@angular/core';
import { TodoService } from '../todo.service';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-todo-add',
  standalone: false,
  templateUrl: './todo-add.component.html',
  styleUrl: './todo-add.component.css'
})
export class TodoAddComponent implements OnInit{
  todo = inject(TodoService);
  builder = inject(FormBuilder);
  tasks = this.builder.group({
    id : [], task : [], date : []
  });
  addTasks() {
    this.todo.addTask(this.tasks.value);
    this.tasks.reset();
  }

  ngOnInit(): void {
      console.log(this.todo.getItems())
  }
  
  
}
