import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-heroes-form',
  templateUrl: './heroes-form.component.html',
  styleUrls: ['./heroes-form.component.css']
})
export class HeroesFormComponent {

  @Output() insertChange = new EventEmitter<boolean>();

  heroForm = this.fb.group({
    name: ['', Validators.required],
    secretIdentity: ['']
  });

  cancel = () => {
    this.insertChange.emit(false);
  }

  constructor(private fb: FormBuilder){}

}
