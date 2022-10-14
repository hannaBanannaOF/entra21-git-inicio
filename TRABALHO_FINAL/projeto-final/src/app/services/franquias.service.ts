import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Franquia } from '../types/types';

@Injectable({ providedIn: 'root' })
export class FranquiaService {
    constructor(private http: HttpClient) { }

    getAll() {
        return this.http.get<Franquia[]>(`/franquias`);
    }
}