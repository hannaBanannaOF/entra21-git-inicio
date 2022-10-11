import { Component, OnInit } from '@angular/core';

export type Hero = {
  id?: number,
  heroName: string,
  secretIdentity?: string,
  universe: "marvel" | "DC",
  deceased?: boolean
}

@Component({
  selector: 'app-heroes-screen',
  templateUrl: './heroes-screen.component.html',
  styleUrls: ['./heroes-screen.component.css']
})
export class HeroesScreenComponent implements OnInit {
  
  editingHero: Hero | null | undefined = null;

  heroes: Hero[] = [
    {
      id: 1,
      heroName: "Iron man",
      universe: "marvel",
      secretIdentity: "Tony Stark",
      deceased: true
    },
    {
      id: 2,
      heroName: "Super-man",
      universe: "DC"
    },
    {
      id: 3,
      heroName: "Wonder Woman",
      universe: "DC"
    },
    {
      id: 4,
      heroName: "Black Widow",
      universe: "marvel",
      secretIdentity: "Natasha Romanova",
      deceased: true
    }
  ];

  inserting = false;

  constructor() { }

  ngOnInit(): void {
  }

  inserirHeroi = () => {
    this.editingHero = null;
    this.inserting = true;
  }

  save = (hero: Hero) => {
    if (hero.id == null) {
      hero.id = (
        this.heroes.length > 0 ? 
        this.heroes.map((h: Hero) => h.id!)
        .sort()[this.heroes.length-1] : 0)+1
      this.heroes.push(hero)
    } else {
      let pos = this.heroes.findIndex((h: Hero) => h.id! == hero.id!)
      this.heroes[pos] = hero;
    }
  }

  remove = (hero: Hero) => {
    this.heroes = this.heroes.filter((h: Hero) => h.id! != hero.id!);
  }

  edit = (heroID: number) => {
    this.editingHero = this.heroes.find((h: Hero) => h.id! == heroID!);
    this.inserting = true;
  }

}
