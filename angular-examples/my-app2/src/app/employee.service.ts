import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  _http : HttpClient = inject(HttpClient);
  constructor() { }

  getUsers() : Observable<any> {
    return this._http.get("http://localhost:3000/employees");
  }

  saveUser(data: any) : Observable<any> {
    console.log('saveUser');
    return this._http.post("http://localhost:3000/employees", data);
  }
}
