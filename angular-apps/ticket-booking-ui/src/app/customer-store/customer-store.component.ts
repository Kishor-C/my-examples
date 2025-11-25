import { Component, inject } from '@angular/core';
import { FormBuilder, ReactiveFormsModule } from '@angular/forms';
import { CustomerTicketBookingService } from '../customer-ticket-booking.service';

@Component({
  selector: 'app-customer-store',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './customer-store.component.html',
  styleUrl: './customer-store.component.css'
})
export class CustomerStoreComponent {
  private _builder = inject(FormBuilder);
  private _service = inject(CustomerTicketBookingService);

  customerForm = this._builder.group({
    name : [], phone : [], dob : []
  });
  successMessage : string | undefined = undefined;
  public handleSubmit() {
    this._service
    .addCustomer(this.customerForm.value)
    .subscribe({next : (s)=>{
      let id = s.customerId;
      this.successMessage = "Registration success, use "+id+" to book tickets";
    }, error: (e)=>{
        alert(e)
    }});
  }
}
