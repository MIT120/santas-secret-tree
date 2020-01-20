import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { ThirdComponent } from './third.component';
import { Routes, RouterModule } from '@angular/router';
import { CommonModule } from '@angular/common';

const routes: Routes = [
  {
      path: "third",
      component: ThirdComponent,
  }
];

@NgModule({
  declarations: [
    ThirdComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    RouterModule.forChild(routes),
  ],
  providers: [],
  bootstrap: [ThirdComponent]
})
export class ThirdModule { }
