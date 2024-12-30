import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GetCarDataComponent } from './get-car-data.component';

describe('GetCarDataComponent', () => {
  let component: GetCarDataComponent;
  let fixture: ComponentFixture<GetCarDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [GetCarDataComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(GetCarDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
