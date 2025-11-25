import { Component, inject } from '@angular/core';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { CustomerTicketBookingService } from '../customer-ticket-booking.service';

@Component({
  selector: 'app-view-tickets-by-customer-id',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './view-tickets-by-customer-id.component.html',
  styleUrl: './view-tickets-by-customer-id.component.css'
})
export class ViewTicketsByCustomerIdComponent {
  
  private _builder = inject(FormBuilder);
  private _service = inject(CustomerTicketBookingService);
  customerForm = this._builder.group({id:['']})
  tickets : any | undefined = undefined;
  handleSubmit() {
    let id = this.customerForm.controls['id'].value;
    this._service.findTicket(id)
    .subscribe({next : (s) => {
      this.tickets = s;
    }, error : (e) => {
      this.tickets = undefined;
      alert(e.error.error);
    }})
  }
}
