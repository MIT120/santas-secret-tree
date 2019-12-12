import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SecondModule } from './second/second.module';
import { FirstModule } from './first/first.module';

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FirstModule,
    SecondModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
