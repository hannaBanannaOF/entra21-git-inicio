import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HelloWorldComponent } from './hello-world/hello-world.component';
import { HeaderComponent } from './header/header.component';
import { HighlightComponent } from './highlight/highlight.component';

@NgModule({
  declarations: [
    AppComponent,
    HelloWorldComponent,
    HeaderComponent,
    HighlightComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
