import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletedCarDataComponent } from './deleted-car-data.component';

describe('DeletedCarDataComponent', () => {
  let component: DeletedCarDataComponent;
  let fixture: ComponentFixture<DeletedCarDataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DeletedCarDataComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DeletedCarDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
