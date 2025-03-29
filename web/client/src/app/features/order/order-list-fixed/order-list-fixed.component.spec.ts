import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OrderListFixedComponent } from './order-list-fixed.component';

describe('OrderListFixedComponent', () => {
  let component: OrderListFixedComponent;
  let fixture: ComponentFixture<OrderListFixedComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OrderListFixedComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OrderListFixedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
