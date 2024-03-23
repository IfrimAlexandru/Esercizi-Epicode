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

import { Error404Component } from './components/error404/error404.component';
import { FiatComponent } from './components/fiat/fiat.component';
import { FordComponent } from './components/ford/ford.component';
import { AudiComponent } from './components/audi/audi.component';
import { MazdaComponent } from './components/mazda/mazda.component';

const routes: Route[] = [  //route

  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'fiat',
    component: FiatComponent
  },
  {
    path: 'audi',
    component: AudiComponent
  },
  {
    path: 'ford',
    component: FordComponent
  },
  {
    path: 'mazda',
    component: MazdaComponent
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
    
    Error404Component,
    FiatComponent,
    FordComponent,
    AudiComponent,
    MazdaComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes) //route
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
