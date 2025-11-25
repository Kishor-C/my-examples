import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';

export interface Employee { id : number, name : string };

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  baseURI = "http://localhost:3000/employees";
  _http = inject(HttpClient);
  constructor() { }

  getEmployees() : Observable<Employee[]> {
   return this._http.get<Employee[]>(this.baseURI);
  }
}
