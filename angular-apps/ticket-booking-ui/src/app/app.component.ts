import { Component } from '@angular/core';
import { RouterLink, RouterOutlet } from '@angular/router';
import { CustomerStoreComponent } from './customer-store/customer-store.component';
import { BookTicketComponent } from './book-ticket/book-ticket.component';
import { ViewCustomerByTicketNoComponent } from './view-customer-by-ticket-no/view-customer-by-ticket-no.component';
import { ViewTicketsByCustomerIdComponent } from './view-tickets-by-customer-id/view-tickets-by-customer-id.component';
import { provideHttpClient, withFetch } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { CommonModule, JsonPipe } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterLink, CustomerStoreComponent, BookTicketComponent, ViewCustomerByTicketNoComponent, ViewTicketsByCustomerIdComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ticket-booking-ui';
}
