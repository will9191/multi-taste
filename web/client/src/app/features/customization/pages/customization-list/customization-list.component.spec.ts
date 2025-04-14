import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CustomizationListComponent } from './customization-list.component';

describe('CustomizationListComponent', () => {
  let component: CustomizationListComponent;
  let fixture: ComponentFixture<CustomizationListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CustomizationListComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CustomizationListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
