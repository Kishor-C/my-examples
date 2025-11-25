import { Component, inject, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Employee, EmployeeService } from './employee.service';
import { JsonPipe, NgFor, NgIf } from '@angular/common';

@Component({
  selector: 'app-root',
  imports: [NgFor, NgIf, JsonPipe],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  title = 'myapp4';
  service = inject(EmployeeService);
  employees : Employee[] = [] ;
  employee !: Employee;
  index = 0;
  ngOnInit(): void {
      this.service.getEmployees().subscribe({
        next : value => {this.employees = value; this.employee = value[0]},
        error : err => console.log('Error:',err),
        complete : () => console.log('completed')
      });
  }
  next() {
    this.index++;
    this.employee = this.employees[this.index];
  }
  previous() {
    this.index--;
    this.employee = this.employees[this.index];
  }

}
