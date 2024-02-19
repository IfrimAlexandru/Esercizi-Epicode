// Ottiene l'elemento HTML con ID "tombola"
const tombola = document.getElementById("tombola");

// Array che conterrà tutti i numeri della tombola (da 1 a 90)
const arrayTombolone = [];

// Array che conterrà i numeri già estratti
const numeriUsciti = [];

// Funzione per generare e visualizzare i numeri della tombola
const numeriTombola = () => {
    // Ciclo per generare numeri da 1 a 90
    for (let i = 0; i < 90; i++) {
        // Crea un nuovo elemento div
        const div = document.createElement("div");
        // Crea un nuovo elemento span
        const span = document.createElement("span");
        // Assegna il testo al numero corrente
        span.innerText = i + 1;
        // Assegna un ID univoco al div
        div.setAttribute("id", "numero" + i);
        // Aggiunge la classe "classeDiv" al div
        div.classList.add("classeDiv");
        // Aggiunge l'elemento span come figlio del div
        div.appendChild(span);
        // Aggiunge il div come figlio dell'elemento "tombola"
        tombola.appendChild(div);
        // Aggiunge il numero corrente all'array "arrayTombolone"
        arrayTombolone.push(i);
    }
};

// Funzione per generare numeri casuali non ripetuti
const generaNumeri = () => {
    // Genera un numero casuale compreso tra 1 e la lunghezza di "arrayTombolone"
    let numero = Math.floor(Math.random() * arrayTombolone.length) + 1;
    // Controlla se il numero è già stato estratto
    let trova = numeriUsciti.indexOf(numero);
    if (trova === -1) {
        // Se il numero non è stato estratto, lo aggiunge all'array "numeriUsciti"
        numeriUsciti.push(numero);
        // Ottiene l'elemento div corrispondente al numero estratto
        const cella = document.getElementById("numero" + (numero - 1));
        // Aggiunge la classe "numeroUscito" al div per evidenziarlo
        cella.classList.add("numeroUscito");
    } else {
        // Se il numero è già stato estratto e la lunghezza di "numeriUsciti" è inferiore alla lunghezza di "arrayTombolone", richiama la funzione "generaNumeri" ricorsivamente
        if (numeriUsciti.length < arrayTombolone.length) {
            generaNumeri();
        }
    }
};

// Funzione per gestire l'evento click sul bottone
const gestioneBottone = () => {
    // Ottiene l'elemento del bottone con ID "buttonId"
    const bottone = document.getElementById("buttonId");
    // Aggiunge un listener per l'evento click sul bottone
    bottone.addEventListener("click", function(event){
        // Impedisce il comportamento predefinito del bottone
        event.preventDefault();
        // Chiama la funzione "generaNumeri" quando il bottone viene cliccato
        generaNumeri();
    });
};

// Aggiunge un listener per l'evento "load" sulla finestra
window.addEventListener("load", function () {
    // Chiama la funzione "numeriTombola" quando la finestra è completamente caricata
    numeriTombola();
    // Chiama la funzione "gestioneBottone" quando la finestra è completamente caricata
    gestioneBottone();
});
 