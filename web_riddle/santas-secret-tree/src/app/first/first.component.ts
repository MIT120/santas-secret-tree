import { Component } from '@angular/core';
import { RandomSound } from '../helpers/randomsound';

@Component({
  selector: '.m-scroll-top m-scroll-top--skin-top',
  templateUrl: './first.component.html',
  styleUrls: ['../app.component.scss']
})
export class FirstComponent extends RandomSound {
  title = 'santas-secret-tree';
}

