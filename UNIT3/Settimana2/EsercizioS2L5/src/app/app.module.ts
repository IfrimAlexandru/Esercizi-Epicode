import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Route, RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { TodoService } from './services/todo.service';
import { UserService } from './services/user.service';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { CompletiComponent } from './components/completi/completi.component';
import { IncompletiComponent } from './components/incompleti/incompleti.component';
import { UsersComponent } from './components/users/users.component';

const routes: Route[] = [
  {
    path: '',
    component: HomeComponent
  },
  {
    path: 'completi',
    component: CompletiComponent
  },
  {
    path: 'incompleti',
    component: IncompletiComponent
  },
  {
    path: 'users',
    component: UsersComponent
  }
  
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    CompletiComponent,
    IncompletiComponent,
    UsersComponent
  ],
  imports: [
    BrowserModule,
    NgbModule,
    RouterModule.forRoot(routes),
    HttpClientModule
  ],
  providers: [TodoService, UserService],
  bootstrap: [AppComponent]
})
export class AppModule { }
