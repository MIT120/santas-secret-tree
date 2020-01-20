import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SecondModule } from './second/second.module';
import { FirstModule } from './first/first.module';
import { ThirdModule } from './third/third.module';

// import { SocketIoModule, SocketIoConfig } from 'ngx-socket-io';
// import { AppSettings } from './app-settings';

// const config: SocketIoConfig = { url: `${AppSettings.API_ENTPOINT}`, options: {} };

@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FirstModule,
    SecondModule,
    ThirdModule,
    // SocketIoModule.forRoot(config),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
