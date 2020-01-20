import { Component } from '@angular/core';
import { RandomSound } from '../helpers/randomsound';
import { Router } from '@angular/router';

@Component({
  selector: 'second',
  templateUrl: './second.component.html',
  styleUrls: ['../app.component.scss', './second.component.css']
})
export class SecondComponent extends RandomSound {
  title = 'santas-secret-tree';
  email: string;
  constructor(private router: Router) {
    super();
  }

  public secondInput(input) {
    this.email = input;
    console.log(this.email);
  }

  public subscribe() {
    if (this.email === '32aef6d@gmail.com') {
      console.log(this.email);
      this.randomFunction();
      window.location.href = 'http://i358717.hera.fhict.nl/poca/index.html';
    }
  }
}

