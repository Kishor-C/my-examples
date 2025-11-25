import { AfterContentInit, AfterViewInit, Component, computed, ContentChild, effect, ElementRef, HostBinding, HostListener, inject, OnInit, QueryList, ViewChild, viewChild, ViewChildren, ViewEncapsulation } from '@angular/core';
import { HelloComponent } from './hello/hello.component';
import { FormBuilder, Validators } from '@angular/forms';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  standalone : false,
  styleUrls : ['./app.component.css']
})
export class AppComponent implements OnInit {
  private _service : EmployeeService = inject(EmployeeService);;
  ngOnInit(): void {
      this._service.getUsers().subscribe({
        next : (value)=>console.log(value)
      });
      this._service.saveUser({id:4, name:"Kishor4"})
      .subscribe({
        next : value => console.log(value),
        error : err => console.log("Error: ", err)
      });
  }
}
