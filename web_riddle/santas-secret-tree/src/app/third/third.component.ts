import { Component } from '@angular/core';
import { RandomSound } from '../helpers/randomsound';


declare var $: any;

@Component({
  selector: 'third',
  templateUrl: './third.component.html',
  styleUrls: ['../app.component.scss', './third.component.css']
})
export class ThirdComponent {
  title = 'santas-secret-tree';
  email: string;
  
  constructor() {

  }

  public secondInput(input) {
    this.email = input;
    window.close();
    console.log(this.email);
  }

  public subscribe() {
    if (this.email === '32aef6d@gmail.com') {
      console.log(this.email);
    }
  }
}

