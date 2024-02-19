/* ESERCIZIO 1
  Scrivi una funzione per concatenare due stringhe ricevute come parametri, selezionando solamente i primi 2 caratteri della
  prima e gli ultimi 3 della seconda. Converti la stringa risultante in maiuscolo e mostrala con un console.log().
*/
console.log(">>>>>> ESERCIZIO 1 <<<<<<")
/* RISPOSTA */

const stringa1 = "corso";
const stringa2 = "epicode";

function stringheConcatenate(stringa1, stringa2) {
  let operazioneStringa1 = stringa1.slice(0, 2);
  let operazioneStringa2 = stringa2.slice(-3);
  let risultato = operazioneStringa1 + operazioneStringa2;
  risultato = risultato.toUpperCase();
  return risultato;
}

let risultato = stringheConcatenate(stringa1, stringa2);
console.log(risultato);




/* ESERCIZIO 2 (for)
  Scrivi una funzione che torni un array di 10 elementi; ognuno di essi deve essere un valore random compreso tra 0 e 100 (incluso).
*/
console.log(">>>>>> ESERCIZIO 2 <<<<<<")
/* RISPOSTA */


function arrayRandom() {
  let arrayGenerato = [];

  for (i = 0; i < 10; i++) {
    let numeriCasuli = Math.floor(Math.random() * 101);
    arrayGenerato.push(numeriCasuli);
  }
  return arrayGenerato;
}
let arrayCasuale = arrayRandom();
console.log(arrayCasuale)





/* ESERCIZIO 3 (filter)
  Scrivi una funzione per ricavare solamente i valori PARI da un array composto da soli valori numerici
*/
console.log(">>>>>> ESERCIZIO 3 <<<<<<")
/* RISPOSTA */


function valoriPari(arrayCasuale) {
  let numeriPari = arrayCasuale.filter(i => i % 2 === 0);
  return numeriPari;
}
numeriPari = valoriPari(arrayCasuale)
console.log(numeriPari)




/* ESERCIZIO 4 (forEach)
  Scrivi una funzione per sommare i numeri contenuti in un array
*/
console.log(">>>>>> ESERCIZIO 4 <<<<<<")
/* RISPOSTA */


function sommaForEach(arrayCasuale) {
  let somma = 0;
  arrayCasuale.forEach(i => {
    somma += i;
  })
  return somma;
}

somma = sommaForEach(arrayCasuale);
console.log(somma);



/* ESERCIZIO 5 (reduce)
  Scrivi una funzione per sommare i numeri contenuti in un array
*/
console.log(">>>>>> ESERCIZIO 5 <<<<<<")
/* RISPOSTA */


function sommaReduce(arrayCasuale) {
  let somma2 = arrayCasuale.reduce((tot, i ) => tot + i, 0);
  return somma2
}

somma2 = sommaReduce(arrayCasuale)
console.log(somma2)


/* ESERCIZIO 6 (map)
  Scrivi una funzione che, dato un array di soli numeri e un numero n come parametri, ritorni un secondo array con tutti i valori del precedente incrementati di n
*/
console.log(">>>>>> ESERCIZIO 6 <<<<<<")
/* RISPOSTA */


function map(arrayCasuale) {
  let numeriIncrementati = arrayCasuale.map((i) => i + 10);
  return numeriIncrementati;
}

numeriIncrementati = map(arrayCasuale);
console.log(numeriIncrementati)




/* ESERCIZIO 7 (map)
  Scrivi una funzione che, dato un array di stringhe, ritorni un nuovo array contenente le lunghezze delle rispettive stringhe dell'array di partenza
  es.: ["EPICODE", "is", "great"] => [7, 2, 5]
*/

console.log(">>>>>> ESERCIZIO 7 <<<<<<")
/* RISPOSTA */

const arrayStringhe = ["cane", "gatto", "cavallo", "coniglio"];

function map2(arrayStringhe) {
  let lunghezzaStringhe = arrayStringhe.map(i => i.length);
  return lunghezzaStringhe
}

lunghezzaStringhe = map2(arrayStringhe)
console.log(arrayStringhe)
console.log(lunghezzaStringhe)




/* ESERCIZIO 8 (forEach o for)
  Scrivi una funzione per creare un array contenente tutti i valori DISPARI da 1 a 99.
*/
console.log(">>>>>> ESERCIZIO 8 <<<<<<")

/* RISPOSTA */
function arrayNumeriDispari() {
  let arrayDispari = [];

  for (i = 1; i <= 99; i+= 2) {
    arrayDispari.push(i);
  }
  return arrayDispari;
}
let arrayDispari = arrayNumeriDispari();
console.log(arrayDispari)






/* Questo array di film verrà usato negli esercizi a seguire. Non modificarlo e scorri oltre per riprendere gli esercizi :) */
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

/* ESERCIZIO 9 (forEach)
  Scrivi una funzione per trovare il film più vecchio nell'array fornito.
*/
function annoFilm(movies){

}


/* ESERCIZIO 10
  Scrivi una funzione per ottenere il numero di film contenuti nell'array fornito.
*/
console.log(">>>>>> ESERCIZIO 10 <<<<<<")
/*RISPOSTA */
function numeroDiFilm(movies) {
  return movies.length;
}

let numeroFilm = numeroDiFilm(movies);
console.log("Ci sono " + numeroFilm + " film nel nostro catalogo")

/* ESERCIZIO 11 (map)
  Scrivi una funzione per creare un array con solamente i titoli dei film contenuti nell'array fornito.
*/
console.log(">>>>>> ESERCIZIO 11 <<<<<<")

/*RISPOSTA */

function titoliDeiFilm(movies) {
return movies.map (i => i.Title);
}

let titoliFilm = titoliDeiFilm(movies);
console.log(titoliFilm);




/* ESERCIZIO 12 (filter)
  Scrivi una funzione per ottenere dall'array fornito solamente i film usciti nel millennio corrente.
*/
console.log(">>>>>> ESERCIZIO 12 <<<<<<") //DA COMPLETARE
/* RISPOSTA */

function filmFiltrati(movies){
  const moviesFiltrati = movies.filter(i => parseInt(i.Year) >= 2000).map(i => i.Title);
  return moviesFiltrati;
}
moviesFiltrati = filmFiltrati(movies);
console.log(filmFiltrati(movies));





/* ESERCIZIO 13 (reduce)
  Scrivi una funzione per calcolare la somma di tutti gli anni in cui sono stati prodotti i film contenuti nell'array fornito.
*/
console.log(">>>>>> ESERCIZIO 13 <<<<<<")
/* RISPOSTA */
function sommaDegliAnni(movies) {
  let sommaAnni = movies.reduce ((tot, i) => tot + parseInt(i.Year), 0)
  return sommaAnni
}

let sommaAnni = sommaDegliAnni(movies);
console.log(sommaAnni);


/* ESERCIZIO 14 (find)
  Scrivi una funzione per ottenere dall'array fornito uno specifico film (la funzione riceve un imdbID come parametro).
*/

/*RISPOSTA*/
const elenco = document.getElementById("elenco");
movies.forEach(i =>{
  let option = document.createElement("option");
  option.setAttribute("value", i.imdbID);
  option.innerText = i.Title;
  elenco.appendChild(option);
});



/* ESERCIZIO 15 (findIndex)
  Scrivi una funzione per ottenere dall'array fornito l'indice del primo film uscito nell'anno fornito come parametro.
*/
