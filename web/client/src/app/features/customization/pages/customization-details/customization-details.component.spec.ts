import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomizationDetailsComponent } from './customization-details.component';

describe('CustomizationDetailsComponent', () => {
  let component: CustomizationDetailsComponent;
  let fixture: ComponentFixture<CustomizationDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CustomizationDetailsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustomizationDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
