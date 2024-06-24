import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SoldCarDataComponent } from './sold-car-data.component';

describe('SoldCarDataComponent', () => {
  let component: SoldCarDataComponent;
  let fixture: ComponentFixture<SoldCarDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SoldCarDataComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(SoldCarDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
