import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewTicketsByCustomerIdComponent } from './view-tickets-by-customer-id.component';

describe('ViewTicketsByCustomerIdComponent', () => {
  let component: ViewTicketsByCustomerIdComponent;
  let fixture: ComponentFixture<ViewTicketsByCustomerIdComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ViewTicketsByCustomerIdComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewTicketsByCustomerIdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
