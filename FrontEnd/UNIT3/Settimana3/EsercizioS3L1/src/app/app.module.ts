import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms'; //Importa FormsModue e ReactiveFormsModule

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { ReactiveFormComponent } from './components/reactive-form/reactive-form.component';
import { TemplateDrivenFormComponent } from './components/template-driven-form/template-driven-form.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ReactiveFormComponent,
    TemplateDrivenFormComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule  //Aggiungi FormsModule agli imports
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
