import { Component, ViewChild, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms'; //I TDF sono delle istanze NgForm


@Component({
  selector: 'app-template-driven-form',
  templateUrl: './template-driven-form.component.html',
  styleUrls: ['./template-driven-form.component.scss']
})
export class TemplateDrivenFormComponent {
  model = {
    name: '',
    surname: '',
    email: '',
    password1: '',
    password2: '',
    gender: '' // Inizializza con il valore vuoto o con il valore predefinito, se necessario
};



  @ViewChild('form', {static: true}) form!: NgForm;  //Attraverso il decoratore ViewChild il component intercetta i cambiamenti nell'oggetto indicato (form) e può gestirli, static true in quantoil component deve leggere i valori come statici

  ngOnInit(): void {
    //Metodo usato per tracciare la validità del form
    this.form.statusChanges?.subscribe(status => {
      console.log('Stato del form: ', status);
    });
  }



  onSubmit(form: NgForm) {
    if (form.valid) {
      // Invia i dati al server o gestisci l'invio del form
      console.log(this.model);
    } else {
      // Gestisci eventuali errori di validazione
    }
  }
  
}
