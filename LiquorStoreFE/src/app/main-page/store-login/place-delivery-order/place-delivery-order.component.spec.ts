import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlaceDeliveryOrderComponent } from './place-delivery-order.component';

describe('PlaceDeliveryOrderComponent', () => {
  let component: PlaceDeliveryOrderComponent;
  let fixture: ComponentFixture<PlaceDeliveryOrderComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PlaceDeliveryOrderComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PlaceDeliveryOrderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
