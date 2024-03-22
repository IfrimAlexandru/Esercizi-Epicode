import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router'; // route

import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import { EvidenzaComponent } from './components/evidenza/evidenza.component';
import { MarchiComponent } from './components/marchi/marchi.component';
import { IntroComponent } from './components/intro/intro.component';
import { AutoComponent } from './components/auto/auto.component';
import { Error404Component } from './components/error404/error404.component';

const routes: Route[] = [  //route

  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'auto/:id',
    component: AutoComponent
  },
  {
    path: '**',
    component: Error404Component
  }
]

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    HomeComponent,
    EvidenzaComponent,
    MarchiComponent,
    IntroComponent,
    AutoComponent,
    Error404Component
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes) //route
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
