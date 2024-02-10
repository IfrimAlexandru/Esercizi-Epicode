const movies = [
  {
    Title: 'The Lord of the Rings: The Fellowship of the Ring',
    Year: '2001',
    imdbID: 'tt0120737',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg',
  },

  {
    Title: 'The Lord of the Rings: The Return of the King',
    Year: '2003',
    imdbID: 'tt0167260',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings: The Two Towers',
    Year: '2002',
    imdbID: 'tt0167261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNGE5MzIyNTAtNWFlMC00NDA2LWJiMjItMjc4Yjg1OWM5NzhhXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of War',
    Year: '2005',
    imdbID: 'tt0399295',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTYzZWE3MDAtZjZkMi00MzhlLTlhZDUtNmI2Zjg3OWVlZWI0XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'Lords of Dogtown',
    Year: '2005',
    imdbID: 'tt0355702',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDBhNGJlOTAtM2ExNi00NmEzLWFmZTQtYTZhYTRlNjJjODhmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg',
  },
  {
    Title: 'The Lord of the Rings',
    Year: '1978',
    imdbID: 'tt0077869',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGMyNWJhZmYtNGQxYi00Y2ZjLWJmNjktNTgzZWJjOTg4YjM3L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1990',
    imdbID: 'tt0100054',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOTI2NTQyODk0M15BMl5BanBnXkFtZTcwNTQ3NDk0NA@@._V1_SX300.jpg',
  },
  {
    Title: 'The Lords of Salem',
    Year: '2012',
    imdbID: 'tt1731697',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjA2NTc5Njc4MV5BMl5BanBnXkFtZTcwNTYzMTcwOQ@@._V1_SX300.jpg',
  },
  {
    Title: 'Greystoke: The Legend of Tarzan, Lord of the Apes',
    Year: '1984',
    imdbID: 'tt0087365',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM5MzcwOTg4MF5BMl5BanBnXkFtZTgwOTQwMzQxMDE@._V1_SX300.jpg',
  },
  {
    Title: 'Lord of the Flies',
    Year: '1963',
    imdbID: 'tt0057261',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BOGEwYTlhMTgtODBlNC00ZjgzLTk1ZmEtNmNkMTEwYTZiM2Y0XkEyXkFqcGdeQXVyMzU4Nzk4MDI@._V1_SX300.jpg',
  },
  {
    Title: 'The Avengers',
    Year: '2012',
    imdbID: 'tt0848228',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Infinity War',
    Year: '2018',
    imdbID: 'tt4154756',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Age of Ultron',
    Year: '2015',
    imdbID: 'tt2395427',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTM4OGJmNWMtOTM4Ni00NTE3LTg3MDItZmQxYjc4N2JhNmUxXkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg',
  },
  {
    Title: 'Avengers: Endgame',
    Year: '2019',
    imdbID: 'tt4154796',
    Type: 'movie',
    Poster:
      'https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg',
  },
]

/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

// JS Basics

/* ESERCIZIO A
  Crea una variabile chiamata "sum" e assegnaci il risultato della somma tra i valori 10 e 20.
*/
console.log(">>>>>> ESERCIZIO A <<<<<<")
/*RISPOSTA*/

const sum = 10 + 20;
console.log(`somma = ${sum}`)

/* ESERCIZIO B
  Crea una variabile chiamata "random" e assegnaci un numero casuale tra 0 e 20 (deve essere generato dinamicamente a ogni esecuzione).
*/
console.log(">>>>>> ESERCIZIO B <<<<<<")
/* RISPOSTA*/

let random = Math.floor(Math.random() * 21);
console.log(`In numero random è ${random}`);



/* ESERCIZIO C
  Crea una variabile chiamata "me" e assegnaci un oggetto contenente le seguenti proprietà: name = il tuo nome, surname = il tuo cognome, age = la tua età.
*/
console.log(">>>>>> ESERCIZIO C <<<<<<")
/*RISPOSTA*/

const me = {
  name: "Alexandru",
  surname: "Ifrim",
  age: 25
};

console.log(me);


/* ESERCIZIO D
  Crea del codice per rimuovere programmaticamente la proprietà "age" dall'oggetto precedentemente creato.
*/
console.log(">>>>>> ESERCIZIO D <<<<<<")
/*RISPOSTA*/

delete me.age;
console.log(me)

/* ESERCIZIO E
  Crea del codice per aggiungere programmaticamente all'oggetto precedentemente creato un array chiamato "skills", contenente i linguaggi di programmazione che conosci.
*/
console.log(">>>>>> ESERCIZIO E <<<<<<")
/*RISPOSTA*/
let skills = ["Python", "JavaScript", "C++"]
me.skills = skills;

console.log(me)


/* ESERCIZIO F
  Crea un pezzo di codice per aggiungere un nuovo elemento all'array "skills" contenuto nell'oggetto "me".
*/
console.log(">>>>>> ESERCIZIO F <<<<<<")
/*RISPOSTA*/
me.skills.push("TypeScript");

console.log(me)


/* ESERCIZIO G
  Crea un pezzo di codice per rimuovere programmaticamente l'ultimo elemento dall'array "skills" contenuto nell'oggetto "me".
*/
console.log(">>>>>> ESERCIZIO G <<<<<<")
/*RISPOSTA*/
me.skills.pop()
console.log(me)
// Funzioni

/* ESERCIZIO 1
  Crea una funzione chiamata "dice": deve generare un numero casuale tra 1 e 6.
*/
console.log(">>>>>> ESERCIZIO 1 <<<<<<")
/*RISPOSTA*/

function dice() {
  return Math.floor(Math.random() * 7);
}
const numeroCasuale = dice();
console.log(`Il numero casuale è ${numeroCasuale}`)

/* ESERCIZIO 2
  Crea una funzione chiamata "whoIsBigger" che riceve due numeri come parametri e ritorna il maggiore dei due.
*/
console.log(">>>>>> ESERCIZIO 2 <<<<<<")
/*RISPOSTA*/

function whoIsBigger(n1, n2) {
  if (n1 > n2) {
    return n1;
  } else {
    return n2;
  }
}

console.log(`Il numero più grande è ${whoIsBigger(10, 20)}`)

/* ESERCIZIO 3
  Crea una funzione chiamata "splitMe" che riceve una stringa come parametro e ritorna un'array contenente ogni parola della stringa.

  Es.: splitMe("I love coding") => ritorna ["I", "Love", "Coding"]
*/

console.log(">>>>>> ESERCIZIO 3 <<<<<<")
/*RISPOSTA*/

function splitMe(stringa) {
  return stringa.split(" ");
}

console.log(splitMe("I love coding"))

/* ESERCIZIO 4
  Crea una funzione chiamata "deleteOne" che riceve una stringa e un booleano come parametri.
  Se il valore booleano è true la funzione deve ritornare la stringa senza il primo carattere, altrimenti la deve ritornare senza l'ultimo.
*/
console.log(">>>>>> ESERCIZIO 4 <<<<<<")
/*RISPOSTA*/
function deleteOne(stringa, bool) {
  if (bool === true) {
    return stringa.slice(1);
  } else {
    return stringa.slice(0, -1);
  }
}
console.log(deleteOne("ciao", true));

/* ESERCIZIO 5
  Crea una funzione chiamata "onlyLetters" che riceve una stringa come parametro e la ritorna eliminando tutte le cifre numeriche.

  Es.: onlyLetters("I have 4 dogs") => ritorna "I have dogs"
*/
console.log(">>>>>> ESERCIZIO 5 <<<<<<")
/*RISPOSTA*/

function onlyLetters(stringa) {
  return stringa.replace(/[0-9]/g, '')
}

console.log(onlyLetters("giorno9,mese2,anno2024"))


/* ESERCIZIO 6
  Crea una funzione chiamata "isThisAnEmail" che riceve una stringa come parametro e ritorna true se la stringa è un valido indirizzo email.
*/
console.log(">>>>>> ESERCIZIO 6 <<<<<<")
/*RISPOSTA*/

function isThisAnEmail(stringa) {
  const regexEmail = (/^[^\s@]+@[^\s@]+.[^\s@]+$/);
  return regexEmail.test(stringa);
}

console.log(isThisAnEmail("ifrim@alexandru.com"));


/* ESERCIZIO 7
  Scrivi una funzione chiamata "whatDayIsIt" che ritorna il giorno della settimana corrente.
*/
console.log(">>>>>> ESERCIZIO 7 <<<<<<")
/*RISPOSTA*/

function whatDayIsIt() {
  const oggi = new Date();
  const giorniDellaSettimana = ["Domenica", "Lunedì", "Martedì", "Mercoledì", "Giovedì", "Venerdì", "Sabato"];
  const indiceGiorno = oggi.getDay();
  return giorniDellaSettimana[indiceGiorno];
}

console.log(whatDayIsIt())

/* ESERCIZIO 8
  Scrivi una funzione chiamata "rollTheDices" che riceve un numero come parametro.
  Deve invocare la precedente funzione dice() il numero di volte specificato nel parametro, e deve tornare un oggetto contenente una proprietà "sum":
  il suo valore deve rappresentare il totale di tutti i valori estratti con le invocazioni di dice().
  L'oggetto ritornato deve anche contenere una proprietà "values", contenente un array con tutti i valori estratti dalle invocazioni di dice().

  Example:
  rollTheDices(3) => ritorna {
      sum: 10
      values: [3, 3, 4]
  }
*/
console.log(">>>>>> ESERCIZIO 8 <<<<<<")
/*RISPOSTA*/

function rollTheDices(n) {
  let sum = 0;
  let values = [];

  for (let i = 0; i < n; i++) {
    let numero = dice();
    values.push(numero);
    sum += numero;
  }
  return {
    sum, values
  }
}

console.log(rollTheDices(5))

/* ESERCIZIO 9
  Scrivi una funzione chiamata "howManyDays" che riceve una data come parametro e ritorna il numero di giorni trascorsi da tale data.
*/

console.log(">>>>>> ESERCIZIO 9 <<<<<<")
/*RISPOSTA*/

/*function howManyDays(data){

}


/* ESERCIZIO 10
  Scrivi una funzione chiamata "isTodayMyBirthday" che deve ritornare true se oggi è il tuo compleanno, falso negli altri casi.
*/
console.log(">>>>>> ESERCIZIO 10 <<<<<<")
/*RISPOSTA*/

function isTodayMyBirthday() {
  let dataOggi = new Date();
  let compleanno = new Date(dataOggi.getFullYear(), 4, 16);
  if (dataOggi.getMonth() === compleanno.getMonth() && dataOggi.getDate() === compleanno.getDate()) {
    return true;
  }
  return false;
}

console.log(isTodayMyBirthday())

// Arrays & Oggetti

// NOTA: l'array "movies" usato in alcuni esercizi è definito alla fine di questo file

/* ESERCIZIO 11
  Scrivi una funzione chiamata "deleteProp" che riceve un oggetto e una stringa come parametri; deve ritornare l'oggetto fornito dopo aver eliminato
  in esso la proprietà chiamata come la stringa passata come secondo parametro.
*/
console.log(">>>>>> ESERCIZIO 11 <<<<<<")
/*RISPOSTA*/

/*function deleteProp(oggetto, stringa){

}




/* ESERCIZIO 12
  Scrivi una funzione chiamata "newestMovie" che trova il film più recente nell'array "movies" fornito.
*/
console.log(">>>>>> ESERCIZIO 12 <<<<<<")
/*RISPOSTA*/
function newestMovie(movies) {
  movies.sort((a, b) => parseInt(b.Year) - parseInt(a.Year));
  return movies[0].Title;
}
const filmRecente = newestMovie(movies);
console.log(`Il film più recente è ${filmRecente}`)



/* ESERCIZIO 13
  Scrivi una funzione chiamata countMovies che ritorna il numero di film contenuti nell'array "movies" fornito.
*/
console.log(">>>>>> ESERCIZIO 13 <<<<<<")
/*RISPOSTA*/

function countMovies(movies) {
  return movies.length;
}
const numeroFilm = countMovies(movies);

console.log(`Ci sono ${countMovies(movies)} film disponibili`)


/* ESERCIZIO 14
  Scrivi una funzione chiamata "onlyTheYears" che crea un array con solamente gli anni di uscita dei film contenuti nell'array "movies" fornito.
*/
console.log(">>>>>> ESERCIZIO 14 <<<<<<")
/*RISPOSTA*/

function onlyTheYears(movies) {
  let array = movies.map(movie => movie.Year);
  return array;
}

console.log(onlyTheYears(movies))
/* ESERCIZIO 15
  Scrivi una funzione chiamata "onlyInLastMillennium" che ritorna solamente i film prodotto nel millennio scorso contenuti nell'array "movies" fornito.
*/
console.log(">>>>>> ESERCIZIO 15 <<<<<<")
/*RISPOSTA*/

function onlyInLastMillennium(movies) {
  const filmMillenioScorso = movies.filter(i => {
    const anno = parseInt(i.Year);
    return anno <= 2000;
  });
  return filmMillenioScorso;
}
console.log(onlyInLastMillennium(movies))





/* ESERCIZIO 16
  Scrivi una funzione chiamata "sumAllTheYears" che ritorna la somma di tutti gli anni in cui sono stati prodotti i film contenuti nell'array "movies" fornito.
*/
console.log(">>>>>> ESERCIZIO 16 <<<<<<")
/*RISPOSTA*/
function sumAllTheYears(movies) {
  let somma = 0;
  for (let i = 0; i < movies.length; i++) {
    somma += parseInt(movies[i].Year);
  }
  return somma;
}
console.log(`La somma di tutti gli anni di uscita dei film è ${sumAllTheYears(movies)}`)

/* ESERCIZIO 17
  Scrivi una funzione chiamata "searchByTitle" che riceve una stringa come parametro e ritorna i film nell'array "movies" fornito che la contengono nel titolo.
*/
console.log(">>>>>> ESERCIZIO 17 <<<<<<")
/*RISPOSTA*/

function searchByTitle(stringa) {

  const risultatoRicerca = movies.filter(i => {
    const titolo = i.Title.toLowerCase();
    const ricerca = stringa.toLowerCase();

    return titolo.includes(ricerca);
  });

  return risultatoRicerca;
}

console.log(searchByTitle("avengers"));


/* ESERCIZIO 18
  Scrivi una funzione chiamata "searchAndDivide" che riceve una stringa come parametro e ritorna un oggetto contenente due array: "match" e "unmatch".
  "match" deve includere tutti i film dell'array "movies" fornito che contengono la stringa fornita all'interno del proprio titolo, mentre "unmatch" deve includere tutti i rimanenti.
*/
console.log(">>>>>> ESERCIZIO 18 <<<<<<")
/*RISPOSTA*/
function searchAndDivide(string){
 
  const match = movies.filter(movies => movies.Title.toLowerCase().includes(string.toLowerCase()));
  const unmatch = movies.filter(movies => !movies.Title.toLowerCase().includes(string.toLowerCase()));
  return {match, unmatch};
}
console.log(searchAndDivide("lord"));



/* ESERCIZIO 19
  Scrivi una funzione chiamata "removeIndex" che riceve un numero come parametro e ritorna l'array "movies" fornito privo dell'elemento nella posizione ricevuta come parametro.
*/
console.log(">>>>>> ESERCIZIO 19 <<<<<<")
/*RISPOSTA*/
function removeIndex(i) {
  if (i < 0 || i >= movies.length|| typeof i === "undefined") {
    console.log("INDICE NON VALIDO!!!");
    return movies;
}
movies.splice(i, 1);
return movies;
}

console.log(removeIndex())
// DOM (nota: gli elementi che selezionerai non si trovano realmente nella pagina)

/* ESERCIZIO 20
  Scrivi una funzione per selezionare l'elemento dotato di id "container" all'interno della pagina.
*/
console.log(">>>>>> ESERCIZIO 20 <<<<<<")
/*RISPOSTA*/

function selezionaContainer(){
  const container = document.getElementById(`container`);
  return container;
}

console.log(selezionaContainer())
/* ESERCIZIO 21
  Scrivi una funzione per selezionare ogni tag <td> all'interno della pagina.
*/
console.log(">>>>>> ESERCIZIO 21 <<<<<<")
/*RISPOSTA*/

function selezionaTuttiTd(){
const tuttiTd = document.querySelectorAll(`td`);
return tuttiTd;
}

console.log(selezionaTuttiTd())

/* ESERCIZIO 22
  Scrivi una funzione che, tramite un ciclo, stampa in console il testo contenuto in ogni tag <td> all'interno della pagina.
*/
console.log(">>>>>> ESERCIZIO 22 <<<<<<")
/*RISPOSTA*/

function stampaTd(){
  const tuttiTd = document.querySelectorAll(`td`);
  for (let i = 0; i < tuttiTd.length; i++){
    console.log(tuttiTd[i].textContent);
  }
}
stampaTd()
/* ESERCIZIO 23
  Scrivi una funzione per aggiungere un background di colore rosso a ogni link all'interno della pagina.
*/
console.log(">>>>>> ESERCIZIO 23 <<<<<<")
/*RISPOSTA*/

function bgRosso(){
  const link = document.querySelectorAll(`a`);
  for (let i = 0; i < link.length; i++){
    link[i].style.backgroundColor = `red`;
  }
}
bgRosso()
console.log(`Vedi HTML`)
/* ESERCIZIO 24
  Scrivi una funzione per aggiungere un nuovo elemento alla lista non ordinata con id "myList".
*/
console.log(">>>>>> ESERCIZIO 24 <<<<<<")
/*RISPOSTA*/

function aggiungiLi(){
  const ul = document.getElementById(`myList`);
  const li = document.createElement(`li`);
  const testoLi = document.createTextNode(`ELEMENTO LISTA`);
  
  li.appendChild(testoLi);
  ul.appendChild(li);
}
aggiungiLi();
console.log(`Vedi HTML`)

/* ESERCIZIO 25
  Scrivi una funzione per svuotare la lista non ordinata con id "myList".
*/
console.log(">>>>>> ESERCIZIO 25 <<<<<<")
/*RISPOSTA*/

function svuotaLista(){
  const ul = document.getElementById(`myList`);
  ul.innerHTML = ``;
}
svuotaLista()
console.log(`Vedi HTML`)
/* ESERCIZIO 26
  Scrivi una funzione per aggiungere ad ogni tag <tr> la classe CSS "test"
*/
console.log(">>>>>> ESERCIZIO 26 <<<<<<")
/*RISPOSTA*/

function aggiungiClasseTr(){
  const tr = document.querySelectorAll(`tr`);
  for (let i = 0; i < tr.length; i++){
    tr[i].classList.add(`test`);
  }
}
aggiungiClasseTr()
// [EXTRA] JS Avanzato

/* ESERCIZIO 27
  Crea una funzione chiamata "halfTree" che riceve un numero come parametro e costruisce un mezzo albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  halfTree(3)

  *
  **
  ***

*/

/* ESERCIZIO 28
  Crea una funzione chiamata "tree" che riceve un numero come parametro e costruisce un albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  tree(3)

    *
   ***
  *****

*/

/* ESERCIZIO 29
  Crea una funzione chiamata "isItPrime" che riceve un numero come parametro e ritorna true se il numero fornito è un numero primo.
*/

/* Questo array viene usato per gli esercizi. Non modificarlo. */

