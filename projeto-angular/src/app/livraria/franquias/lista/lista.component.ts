import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Franquia } from '../../types/types';

@Component({
  selector: 'franquia-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {

  listaFranquias: Franquia[] = [];

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get<Franquia[]>("/franquias")
      .subscribe(franquias => this.listaFranquias = franquias);
  }

}
