import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerTicketBookingService {
  private BASE_URL = 'http://localhost:8080/customer'
  constructor(private _http : HttpClient) { }

  addCustomer(customerData : any) : Observable<any> {
    return this._http.post(this.BASE_URL, customerData);
  }
  findTicket(customerId : any) : Observable<any> {
    return this._http.get(`${this.BASE_URL}/tickets/${customerId}`);
  }
  findCustomer(ticketNo : any) : Observable<any> {
    return this._http.get(`${this.BASE_URL}/ticket/${ticketNo}`);
  }
}
