import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegsuccessComponent } from './regsuccess.component';

describe('RegsuccessComponent', () => {
  let component: RegsuccessComponent;
  let fixture: ComponentFixture<RegsuccessComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RegsuccessComponent ]
    })


    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RegsuccessComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
