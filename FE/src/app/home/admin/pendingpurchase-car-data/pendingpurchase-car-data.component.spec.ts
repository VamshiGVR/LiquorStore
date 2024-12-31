import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PendingpurchaseCarDataComponent } from './pendingpurchase-car-data.component';

describe('PendingpurchaseCarDataComponent', () => {
  let component: PendingpurchaseCarDataComponent;
  let fixture: ComponentFixture<PendingpurchaseCarDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [PendingpurchaseCarDataComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(PendingpurchaseCarDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
