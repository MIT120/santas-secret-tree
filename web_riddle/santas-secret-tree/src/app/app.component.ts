import { Component } from '@angular/core';
import { RandomSound } from './helpers/randomsound';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent extends RandomSound {
  title = 'santas-secret-tree';
}

