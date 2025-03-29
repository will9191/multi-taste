import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NewPizzaComponent } from './new-pizza.component';

describe('NewPizzaComponent', () => {
  let component: NewPizzaComponent;
  let fixture: ComponentFixture<NewPizzaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [NewPizzaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NewPizzaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
