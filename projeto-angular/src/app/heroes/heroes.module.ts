import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HeroesScreenComponent } from './heroes-screen/heroes-screen.component';
import { HeroListItemComponent } from './hero-list-item/hero-list-item.component';



@NgModule({
  declarations: [
    HeroesScreenComponent,
    HeroListItemComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    HeroesScreenComponent
  ]
})
export class HeroesModule { }
