import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FavoriteColorComponent } from './favorite-color.component';

describe('FavoriteColorComponent', () => {
  let component: FavoriteColorComponent;
  let fixture: ComponentFixture<FavoriteColorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FavoriteColorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FavoriteColorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
