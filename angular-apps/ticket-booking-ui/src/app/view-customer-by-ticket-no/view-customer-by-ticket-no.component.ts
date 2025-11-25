import { Component, inject } from '@angular/core';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { CustomerTicketBookingService } from '../customer-ticket-booking.service';

@Component({
  selector: 'app-view-customer-by-ticket-no',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './view-customer-by-ticket-no.component.html',
  styleUrl: './view-customer-by-ticket-no.component.css'
})
export class ViewCustomerByTicketNoComponent {
  private _builder = inject(FormBuilder);
  private _service = inject(CustomerTicketBookingService);
  ticketForm = this._builder.group({id:['']})
  customer : any | undefined = undefined;
  handleSubmit() {
    let id = this.ticketForm.controls['id'].value;
    this._service.findCustomer(id)
    .subscribe({next : (s) => {
     
      this.customer = s;
    }, error : (e) => {
       alert(e.error.error);
       this.customer = undefined;
    }})
  }
}
