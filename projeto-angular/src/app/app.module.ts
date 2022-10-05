import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HelloWorldComponent } from './hello-world/hello-world.component';
import { HeaderComponent } from './header/header.component';
import { HighlightComponent } from './highlight/highlight.component';
import { HeroesScreenComponent } from './heroes/heroes-screen/heroes-screen.component';
import { HeroesModule } from './heroes/heroes.module';

@NgModule({
  declarations: [
    AppComponent,
    HelloWorldComponent,
    HeaderComponent,
    HighlightComponent
  ],
  imports: [
    BrowserModule, HeroesModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
