/* ESERCIZIO 1
 Scrivi un algoritmo per trovare il più grande tra due numeri interi.
*/

/* RISPOSTA */

let numero1 = 30;
let numero2 = 45;
let numeroMaggiore;

if (numero1 > numero2) {
  numeroMaggiore = numero1;
} else {
  numeroMaggiore = numero2;
}

console.log("Il numero più grande è:", numeroMaggiore);



/* ESERCIZIO 2
  Scrivi un algoritmo che mostri "not equal" in console se un numero intero fornito è diverso da 5.
*/

/* RISPOSTA */

let numeroes2 = 17;

if (numeroes2 !== 5) {
  console.log("not equal");
}



/* ESERCIZIO 3
  Scrivi un algoritmo che mostri "divisibile per 5" in console se un numero fornito è perfettamente divisibile per 5 (suggerimento: usa l'operatore modulo)
*/

/* RISPOSTA */

let numeroes3 = 20;
let resto = numeroes3 % 5;

if (numeroes3 % 5 === 0) {
  console.log("Il numero " + numeroes3 + " è divisibile per 5," + " il resto è di " + resto);
} else {
  console.log("Il numero " + numeroes3 + " NON è divisibile per 5," + " il resto è di " + resto)
}




/* ESERCIZIO 4
  Scrivi un algoritmo per verificare che, dati due numeri interi, il valore di uno di essi sia 8 oppure se la loro addizione/sottrazione sia uguale a 8.
*/

/*  RISPOSTA */


let numero1es4 = 9;
let numero2es4 = 1;

if (numero1es4 === 8 ||
  numero2es4 === 8 ||
  numero1es4 + numero2es4 === 8 ||
  numero1es4 - numero2es4 === 8 ||
  numero2es4 - numero1es4 === 8) {
  console.log("Uno dei numeri è 8 oppure la loro addizione/sottrazione è uguale a 8.");
} else {
  console.log("Nessuna delle condizioni è soddisfatta.");
}





/* ESERCIZIO 5
  Stai lavorando su un sito di e-commerce. Stai salvando il saldo totale del carrello dell'utente in una variabile "totalShoppingCart".
  C'è una promozione in corso: se il totale del carrello supera 50, l'utente ha diritto alla spedizione gratuita (altrimenti la spedizione ha un costo fisso pari a 10).
  Crea un algoritmo che determini l'ammontare totale che deve essere addebitato all'utente per il checkout.
*/


/*  RISPOSTA */

let totalShoppingCart = 60;
let costoSpedizione = 10;

if (totalShoppingCart > 50) {
  console.log("La spedizione è gratuita! Totale da pagare = " + totalShoppingCart)
} else {
  console.log("Totale da pagare = " , totalShoppingCart + costoSpedizione )
}


/* OPPURE */

let totalShoppingCart_1 = 22;
let costoSpedizione_1 = 10;
let Totale = totalShoppingCart_1 + costoSpedizione_1;

if (totalShoppingCart_1 > 50) {
  console.log("La spedizione è gratuita! Totale da pagare = " + totalShoppingCart_1)
} else {
  console.log("Totale da pagare = " + Totale)
}





/* ESERCIZIO 6
  Stai lavorando su un sito di e-commerce. Oggi è il Black Friday e viene applicato il 20% su ogni prodotto.
  Modifica la risposta precedente includendo questa nuova promozione nell'algoritmo, determinando come prima se le spedizioni sono gratuite oppure no e e calcolando il totale.
*/

/* RISPOSTA */

let totalShoppingCart_2 = 120;
let ScontoBlackFriday = 0.2;
let costoSpedizione_2 = 10;
let Sconto = totalShoppingCart_2 * ScontoBlackFriday;

if (totalShoppingCart_2 - Sconto > 50) {
  console.log("La spedizione è gratuita! Totale da pagare = " , totalShoppingCart_2 - Sconto)
} else {
  console.log("Totale da pagare = ", totalShoppingCart_2 - Sconto + costoSpedizione)
}








/* ESERCIZIO 7
  Crea tre variabili, e assegna un valore numerico a ciascuna di esse.
  Utilizzando un blocco condizionale, crea un algoritmo per ordinarle secondo il loro valore, dal più alto al più basso.
  Alla fine mostra il risultato in console.
*/

/*  RISPOSTA */


let numero1es7 = 109;
let numero2es7 = 70;
let numero3es7 = 64;

if (numero1es7 < numero2es7) {
  let temp = numero1es7;
  numero1es7 = numero2es7;
  numero2es7 = temp;
}

if (numero1es7 < numero3es7) {
  let temp = numero1es7;
  numero1es7 = numero3es7;
  numero3es7 = temp;
}

if (numero2es7 < numero3es7) {
  let temp = numero2es7;
  numero2es7 = numero3es7;
  numero3es7 = temp;
}

console.log("Numeri in ordine decrescente:", numero1es7, numero2es7, numero3es7);


/* OPPURE */

let numeri = [3, 12, 9];
numeri.sort((a, b) => b - a);


console.log("Numeri in ordine decrescente:", numeri);



/* ESERCIZIO 8
  Crea un algoritmo per verificare che un valore fornito sia un numero oppure no (suggerimento: cerca su un motore di ricerca "typeof").
*/

/*  RISPOSTA */

let numeroes8 = "12";

if (typeof numeroes8 === "number") {
  console.log("Il valore fornito è un numero")
} else {
  console.log("Il valore fornito NON è un numero")
}



/* ESERCIZIO 9
  Crea un algoritmo per controllare se un numero fornito sia pari o dispari (suggerimento: cerca l'operatore modulo su un motore di ricerca)
*/

/*  RISPOSTA */


let numeroes9 = 12;

if (numeroes9 % 2 === 0) {
  console.log("Il numero " + numeroes9 + " è PARI")
} else {
  console.log("Il numero " + numeroes9 + " è DISPARI")
}



/* ESERCIZIO 10
  Modifica la logica del seguente algoritmo in modo che mostri in console il messaggio corretto in ogni circostanza.
  
  
  let val = 7
  if (val < 10) {
      console.log("Meno di 10");
    } else if (val < 5) {
      console.log("Meno di 5");
    } else {
      console.log("Uguale a 10 o maggiore");
    }

*/

/*  RISPOSTA */

let val = 3
  if (val < 5) {
      console.log("Meno di 5");
    } else if (val < 10) {
      console.log("Meno di 10");
    } else {
      console.log("Uguale a 10 o maggiore");
    }


    /* ESERCIZIO 11
  Fornito il seguente oggetto, scrivi del codice per aggiungere una proprietà "city", il cui valore sarà "Toronto".
*/

/*
const me = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
}

console.log(me);
*/

/* RISPOSTA */

const me1 = {
  name: 'John',
  lastName: 'Doe',
  skills: ['javascript', 'html', 'css'],
};

me1.city = "Toronto";

console.log(me1);


/* ESERCIZIO 12
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere la proprietà "lastName".
*/

/*  RISPOSTA */

delete me1.lastName;  /*serve a rimuovere una proprietà */

console.log(me1);

/* ESERCIZIO 13
  Lavorando sempre sull'oggetto precedentemente fornito, scrivi del codice per rimuovere l'ultimo elemento della proprietà "skills".
*/

/* RISPOSTA */

me1.skills.pop()     /*serve a rimuovere l'ultimo elemento di una proprietà */
me1.skills.shift()   /*serve a rimuovere il primo elemento di una proprietà */

console.log(me1)

/* ESERCIZIO 14
  Scrivi del codice per creare un array inizialmente vuoto. Riempilo successivamente con i numeri da 1 a 10.
*/

/*  RISPOSTA */


let Numeri = [];
Numeri.push(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


console.log(Numeri);



/* ESERCIZIO 15
  Scrivi del codice per sostituire l'ultimo elemento dell'array, ovvero il valore 10, con il valore 100.
*/

/* RISPOSTA */

Numeri[9] = 100;
console.log(Numeri);

