import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewCustomerByTicketNoComponent } from './view-customer-by-ticket-no.component';

describe('ViewCustomerByTicketNoComponent', () => {
  let component: ViewCustomerByTicketNoComponent;
  let fixture: ComponentFixture<ViewCustomerByTicketNoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ViewCustomerByTicketNoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewCustomerByTicketNoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
