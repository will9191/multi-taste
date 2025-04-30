import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StoreSelectionComponent } from './store-selection.component';

describe('StoreSelectionComponent', () => {
  let component: StoreSelectionComponent;
  let fixture: ComponentFixture<StoreSelectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [StoreSelectionComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StoreSelectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
