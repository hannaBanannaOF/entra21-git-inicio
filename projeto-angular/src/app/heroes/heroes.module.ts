import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeroesScreenComponent } from './heroes-screen/heroes-screen.component';
import { HeroListItemComponent } from './hero-list-item/hero-list-item.component';
import { HeroesFormComponent } from './heroes-form/heroes-form.component';
import { ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    HeroesScreenComponent,
    HeroListItemComponent,
    HeroesFormComponent
  ],
  imports: [
    CommonModule, 
    ReactiveFormsModule
  ],
  exports: [
    HeroesScreenComponent
  ]
})
export class HeroesModule { }
