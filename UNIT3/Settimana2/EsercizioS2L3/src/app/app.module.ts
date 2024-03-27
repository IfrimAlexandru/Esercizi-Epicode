import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router';

import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { CarrelloComponent } from './components/carrello/carrello.component';
import { PreferitiComponent } from './components/preferiti/preferiti.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { Error404Component } from './components/error404/error404.component';
import { ProdottiComponent } from './components/prodotti/prodotti.component';

const routes: Route[] = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'preferiti',
    component: PreferitiComponent
  },
  {
    path: 'error404',
    component: Error404Component
  },
  {
    path: '**',
    redirectTo: 'error404'
  }
  
  
  

]

@NgModule({
  declarations: [
    AppComponent,
    CarrelloComponent,
    PreferitiComponent,
    NavbarComponent,
    HomeComponent,
    Error404Component,
    ProdottiComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
