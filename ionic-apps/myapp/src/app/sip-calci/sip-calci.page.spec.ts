import { ComponentFixture, TestBed } from '@angular/core/testing';
import { SipCalciPage } from './sip-calci.page';

describe('SipCalciPage', () => {
  let component: SipCalciPage;
  let fixture: ComponentFixture<SipCalciPage>;

  beforeEach(() => {
    fixture = TestBed.createComponent(SipCalciPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
