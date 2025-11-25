import { ComponentFixture, TestBed } from '@angular/core/testing';

import { User2listComponent } from './user2list.component';

describe('User2listComponent', () => {
  let component: User2listComponent;
  let fixture: ComponentFixture<User2listComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [User2listComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(User2listComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
