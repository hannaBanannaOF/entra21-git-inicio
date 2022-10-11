import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeroesFormComponent } from './heroes-form.component';

describe('HeroesFormComponent', () => {
  let component: HeroesFormComponent;
  let fixture: ComponentFixture<HeroesFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeroesFormComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HeroesFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
