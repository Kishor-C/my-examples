import { TestBed } from '@angular/core/testing';

import { CustomerTicketBookingService } from './customer-ticket-booking.service';

describe('CustomerTicketBookingService', () => {
  let service: CustomerTicketBookingService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CustomerTicketBookingService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
