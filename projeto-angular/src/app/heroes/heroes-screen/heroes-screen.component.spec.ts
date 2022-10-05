import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeroesScreenComponent } from './heroes-screen.component';

describe('HeroesScreenComponent', () => {
  let component: HeroesScreenComponent;
  let fixture: ComponentFixture<HeroesScreenComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HeroesScreenComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HeroesScreenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
