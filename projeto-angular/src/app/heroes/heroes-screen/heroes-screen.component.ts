import { Component, OnInit } from '@angular/core';

export type Hero = {
  id: number,
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
    this.inserting = true;
  }

}
