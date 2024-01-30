/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/



/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/* RISPOSTA */

/*


Stringa (String):
Una sequenza di caratteri, come lettere, numeri e simboli, racchiusa tra virgolette singole ('') o doppie ("").

Numero (Number):
Un valore numerico, che può essere intero o decimale.
Ad esempio, 12, 12.57,-23, ecc...

Booleano (Boolean):
Un valore che può essere true o false, rappresentando rispettivamente la verità o la falsità di un'asserzione.

Null:
Null rappresenta l'assenza intenzionale di valore.
Ad esempio, può essere assegnato a una variabile per indicare che non ha alcun valore al momento.

Array:
Un array è una collezione ordinata di valori, separati da virgole e racchiusi tra parentesi quadre ([]).
Ad esempio, ["mela", "banana", "arancia"].


*/



/* ESERCIZIO 2
 Crea una variable chiamata "myName" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

/*RISPOSTA*/
let myName = "Alexandru"
console.log(myName);




/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

/* RISPOSTA */
let numero1 = 12;
let numero2 = 20;
console.log(numero1 + numero2);

/*OPPURE*/

let addizione = 12 + 20;
console.log(addizione);






/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

/* RISPOSTA */

let x = 12;
console.log(x)






/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "myName" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
let myName2 = "Alexandru";
myName2 = "Ifrim";
console.log(myName2);


/*const myName3 = "Alexandru";
myName3 = "Ifrim";*/   /* in questo caso troverò un errore nella console "Assignement to constant variable" */





/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

/* RISPOSTA */

let sottrazione = 4 - x;
console.log(sottrazione);

/* OPPURE */

let numero4 = 4;
console.log(numero4 - x);




/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

/* SCRIVI QUI LA TUA RISPOSTA */

let name1 = "john";
let name2 = "John";

console.log('name1 e name2 sono uguali:',
  name1 === name2);

console.log(
  'name1 e name2 in lowercase sono uguali:',
  name1.toLowerCase() === name2.toLowerCase());
