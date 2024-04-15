import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router'; // route



import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { ActivePostsComponent } from './components/active-posts/active-posts.component';
import { InactivePostsComponent } from './components/inactive-posts/inactive-posts.component';
import { PostDetailComponent } from './components/post-detail/post-detail.component';
import { EvidenzaComponent } from './components/evidenza/evidenza.component';
import { CorrelatiComponent } from './components/correlati/correlati.component';
import { InteresseComponent } from './components/interesse/interesse.component';
import { Error404Component } from './components/error404/error404.component';

const routes: Route[] = [  //route
  {
    path: 'inactive',
    component: InactivePostsComponent
  },
  {
    path: 'active',
    component: ActivePostsComponent
  },
  {
    path: 'detail/:id',
    component: PostDetailComponent,
    
  },
  {
    path: '',
    component: HomeComponent
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
    HomeComponent,
    ActivePostsComponent,
    InactivePostsComponent,
    PostDetailComponent,
    EvidenzaComponent,
    CorrelatiComponent,
    InteresseComponent,
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
