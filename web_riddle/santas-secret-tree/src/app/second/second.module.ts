import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { SecondComponent } from './second.component';
import { Routes, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';

const routes: Routes = [
  {
      path: "second",
      component: SecondComponent,
  }
];

@NgModule({
  declarations: [
    SecondComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    RouterModule.forChild(routes),
  ],
  providers: [],
  bootstrap: [SecondComponent]
})
export class SecondModule { }
