import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Hero } from '../heroes-screen/heroes-screen.component';

@Component({
  selector: 'app-hero-list-item',
  templateUrl: './hero-list-item.component.html',
  styleUrls: ['./hero-list-item.component.css']
})
export class HeroListItemComponent implements OnInit {

  @Input() hero!: Hero;
  @Output() heroDelete = new EventEmitter<Hero>();
  @Output() heroEdit = new EventEmitter<number>();
  
  constructor() { }

  ngOnInit(): void {
  }

  showID = () => {
    alert(this.hero.secretIdentity ?? 'Desconhecido');
  }

  onDelete = () => {
    this.heroDelete.emit(this.hero);
  }

  onEdit = () => {
    this.heroEdit.emit(this.hero.id);
  }

}
