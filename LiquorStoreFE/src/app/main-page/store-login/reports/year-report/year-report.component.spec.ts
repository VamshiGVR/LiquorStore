import { ComponentFixture, TestBed } from '@angular/core/testing';

import { YearReportComponent } from './year-report.component';

describe('YearReportComponent', () => {
  let component: YearReportComponent;
  let fixture: ComponentFixture<YearReportComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [YearReportComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(YearReportComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
