import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ComponentDueComponent } from './components/component-due/component-due.component';
import { ComponentTreComponent } from './components/component-tre/component-tre.component';
import { ComponentQuattroComponent } from './components/component-quattro/component-quattro.component';

@NgModule({
  declarations: [
    AppComponent,
    ComponentDueComponent,
    ComponentTreComponent,
    ComponentQuattroComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
