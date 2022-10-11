import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-favorite-color',
  template: `
  Favorite Color: 
  <input type="text" [formControl]="favoriteColorControl">
  <p>Value: {{ favoriteColorControl.value }}<p>
  `
})
export class FavoriteColorComponent {

  favoriteColorControl = new FormControl('');

}
