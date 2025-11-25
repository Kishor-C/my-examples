import { Routes } from '@angular/router';
import { CustomerStoreComponent } from './customer-store/customer-store.component';
import { BookTicketComponent } from './book-ticket/book-ticket.component';
import { ViewTicketsByCustomerIdComponent } from './view-tickets-by-customer-id/view-tickets-by-customer-id.component';
import { ViewCustomerByTicketNoComponent } from './view-customer-by-ticket-no/view-customer-by-ticket-no.component';

export const routes: Routes = [
    {path : "", component : CustomerStoreComponent},
    {path : "addCustomer", component : CustomerStoreComponent},
    {path : "bookTicket", component : BookTicketComponent},
    {path : "viewTicketsByCustomerId", component : ViewTicketsByCustomerIdComponent},
    {path : "viewCustomerByTicketNo", component : ViewCustomerByTicketNoComponent}
];
