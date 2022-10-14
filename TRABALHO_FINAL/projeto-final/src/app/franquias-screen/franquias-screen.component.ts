import { Component, OnInit } from '@angular/core';
import { first } from 'rxjs';
import { FranquiaService } from '../services/franquias.service';
import { Franquia } from '../types/types';

@Component({
  selector: 'app-franquias-screen',
  templateUrl: './franquias-screen.component.html',
  styleUrls: ['./franquias-screen.component.css']
})
export class FranquiasScreenComponent implements OnInit {
  loading = false;
  franquias: Franquia[] = [];

  constructor(private franquiaService: FranquiaService) { }

  ngOnInit(): void {
    this.loading = true;
    this.franquiaService.getAll().pipe(first()).subscribe(franquias => {
        this.loading = false;
        this.franquias = franquias;
    });
  }

}
