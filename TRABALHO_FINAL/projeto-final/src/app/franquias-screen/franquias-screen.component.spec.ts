import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FranquiasScreenComponent } from './franquias-screen.component';

describe('FranquiasScreenComponent', () => {
  let component: FranquiasScreenComponent;
  let fixture: ComponentFixture<FranquiasScreenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FranquiasScreenComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FranquiasScreenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
