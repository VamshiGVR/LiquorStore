import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TailBarComponent } from './tail-bar.component';

describe('TailBarComponent', () => {
  let component: TailBarComponent;
  let fixture: ComponentFixture<TailBarComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TailBarComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TailBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
