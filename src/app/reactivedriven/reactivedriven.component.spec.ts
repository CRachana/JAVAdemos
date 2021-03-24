import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReactivedrivenComponent } from './reactivedriven.component';

describe('ReactivedrivenComponent', () => {
  let component: ReactivedrivenComponent;
  let fixture: ComponentFixture<ReactivedrivenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReactivedrivenComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReactivedrivenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
