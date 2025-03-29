import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MySearchFieldComponent } from './my-search-field.component';

describe('MySearchFieldComponent', () => {
  let component: MySearchFieldComponent;
  let fixture: ComponentFixture<MySearchFieldComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [MySearchFieldComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MySearchFieldComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
