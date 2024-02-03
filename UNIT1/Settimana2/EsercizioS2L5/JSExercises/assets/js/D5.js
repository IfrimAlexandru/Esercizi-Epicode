/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per visualizzare l'output, lancia il file HTML a cui è collegato e apri la console dagli strumenti di sviluppo del browser. 
- Utilizza dei console.log() per testare le tue variabili e/o i risultati delle espressioni che stai creando.
*/

/* ESERCIZIO 1
    Dato il seguente array, scrivi del codice per stampare ogni elemento dell'array in console.
*/

console.log(">>>>>> ESERCIZIO 1 <<<<<<")

const pets = ['dog', 'cat', 'hamster', 'redfish']

pets.forEach

console.log(pets)


/* ESERCIZIO 2
    Scrivi del codice per ordinare alfabeticamente gli elementi dell'array "pets".*/

console.log(">>>>>> ESERCIZIO 2 <<<<<<")

pets.sort();

console.log(pets);




/* ESERCIZIO 3
    Scrivi del codice per stampare nuovamente in console gli elementi dell'array "pets", questa volta in ordine invertito.
*/

console.log(">>>>>> ESERCIZIO 3 <<<<<<")

pets.reverse();

console.log(pets);



/* ESERCIZIO 4
    Scrivi del codice per spostare il primo elemento dall'array "pets" in ultima posizione.
*/

console.log(">>>>>> ESERCIZIO 4 <<<<<<")

const Pet1 = pets.shift();     /* In questo caso l'array preso in considerazione è quello dell'esercizio prima ( ESERCIZIO 3),
                               quindi in ultima posizione troveremo "redfish" e non "dog" */
pets.push(Pet1);

console.log(pets);



/* ESERCIZIO 5
    Dato il seguente array di oggetti, scrivi del codice per aggiungere ad ognuno di essi una proprietà "licensePlate" con valore a tua scelta.
*/

console.log(">>>>>> ESERCIZIO 5 <<<<<<")

const cars = [
  {
    brand: 'Ford',
    model: 'Fiesta',
    color: 'red',
    trims: ['titanium', 'st', 'active'],
  },
  {
    brand: 'Peugeot',
    model: '208',
    color: 'blue',
    trims: ['allure', 'GT'],
  },
  {
    brand: 'Volkswagen',
    model: 'Polo',
    color: 'black',
    trims: ['life', 'style', 'r-line'],
  },
]

const licensePlateNumbers = ["CS645RT", "ER234TG", "TR645YU"];

for (let i = 0; i < cars.length; i++) {
  cars[i].licensePlate = licensePlateNumbers[i];
}

console.log(cars);

/* ESERCIZIO 6
    Scrivi del codice per aggiungere un nuovo oggetto in ultima posizione nell'array "cars", rispettando la struttura degli altri elementi.
    Successivamente, rimuovi l'ultimo elemento della proprietà "trims" da ogni auto.
*/

console.log(">>>>>> ESERCIZIO 6 <<<<<<")

const newCar = {
  brand: "Chevrolet",
  model: "Camaro",
  color: "yellow",
  trims: ["carbon fiber", "GT"],
  licensePlate: "US373JH"
};
cars.push(newCar);

console.log(cars);


for (let i = 0; i < cars.length; i++) {
  cars[i].trims.pop();
}

console.log(cars);



/* ESERCIZIO 7
    Scrivi del codice per salvare il primo elemento della proprietà "trims" di ogni auto nel nuovo array "justTrims", sotto definito.
*/
console.log(">>>>>> ESERCIZIO 7 <<<<<<")

const justTrims = []

for (let i = 0; i < cars.length; i++) {
  if (cars[i].trims.length > 0) {
    justTrims.push(cars[i].trims[0]);
  }
}

console.log(justTrims);



/* ESERCIZIO 8
    Cicla l'array "cars" e costruisci un if/else statament per mostrare due diversi messaggi in console. Se la prima lettera della proprietà
    "color" ha valore "b", mostra in console "Fizz". Altrimenti, mostra in console "Buzz".
*/

console.log(">>>>>> ESERCIZIO 8 <<<<<<")

for (let i = 0; i < cars.length; i++) {
  const primaLettera = cars[i].color.charAt(0);

  if (primaLettera === "b") {
    console.log("Fizz");
  } else {
    console.log("Buzz");
  }
}





/* ESERCIZIO 9
    Utilizza un ciclo while per stampare in console i valori del seguente array numerico fino al raggiungimento del numero 32.
*/
console.log(">>>>>> ESERCIZIO 9 <<<<<<")

const numericArray = [
  6, 90, 45, 75, 84, 98, 35, 74, 31, 2, 8, 23, 100, 32, 66, 313, 321, 105,
]

let i = 0;

while (i < numericArray.length && numericArray[i] !== 32) {
  console.log(numericArray[i]);
  i++;
}



/* ESERCIZIO 10
    Partendo dall'array fornito e utilizzando un costrutto switch, genera un nuovo array composto dalle posizioni di ogni carattere all'interno
    dell'alfabeto italiano.
    es. [f, b, e] --> [6, 2, 5]
*/

console.log(">>>>>> ESERCIZIO 10 <<<<<<")


function posizioniAlfabetoItaliano(alfabeto) {

  const posizione = [];

  for (let i = 0; i < alfabeto.length; i++) {
    const carattere = alfabeto[i].toLowerCase();
    switch (carattere) {
      case "a":
        posizione.push(1);
        break;
      case "b":
        posizione.push(2);
        break;
      case "c":
        posizione.push(3);
        break;
      case "d":
        posizione.push(4);
        break;
      case "e":
        posizione.push(5);
        break;
      case "f":
        posizione.push(6);
        break;
      case "g":
        posizione.push(7);
        break;
      case "h":
        posizione.push(8);
        break;
      case "i":
        posizione.push(9);
        break;
      case "j":
        posizione.push(10);
        break;
      case "k":
        posizione.push(11);
        break;
      case "l":
        posizione.push(12);
        break;
      case "m":
        posizione.push(13);
        break;
      case "n":
        posizione.push(14);
        break;
      case "o":
        posizione.push(15);
        break;
      case "p":
        posizione.push(16);
        break;
      case "q":
        posizione.push(17);
        break;
      case "r":
        posizione.push(18);
        break;
      case "s":
        posizione.push(19);
        break;
      case "t":
        posizione.push(20);
        break;
      case "u":
        posizione.push(21);
        break;
      case "v":
        posizione.push(22);
        break;
      case "w":
        posizione.push(23);
        break;
      case "x":
        posizione.push(24);
        break;
      case "y":
        posizione.push(25);
        break;
      case "z":
        posizione.push(26);
        break;
      default:
        console.log("Puoi inserire soltanto lettere dell'alfabeto italiano!!!");
        break;}
  }
  return posizione;
}

const charactersArray = ["b", "b", "t", "x",];

const arrayRisultato = posizioniAlfabetoItaliano(charactersArray);
console.log(arrayRisultato);