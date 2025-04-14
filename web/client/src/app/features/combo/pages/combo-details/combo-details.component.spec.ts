import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComboDetailsComponent } from './combo-details.component';

describe('ComboDetailsComponent', () => {
  let component: ComboDetailsComponent;
  let fixture: ComponentFixture<ComboDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ComboDetailsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ComboDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
