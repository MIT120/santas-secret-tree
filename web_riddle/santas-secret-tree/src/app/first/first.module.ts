import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FirstComponent } from './first.component';
import { Routes, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';

const routes: Routes = [
  {
      path: "",
      component: FirstComponent,
  }
];

@NgModule({
  declarations: [
    FirstComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    RouterModule.forRoot(routes),
  ],
  providers: [],
  bootstrap: [FirstComponent]
})
export class FirstModule { }
