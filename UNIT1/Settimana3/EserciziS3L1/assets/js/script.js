/* ESERCIZIO 1
     Scrivi una funzione per cambiare il titolo della pagina in qualcos'altro
  */

/* RISPOSTA */
function changeTitle (nuovoTitolo) {
    document.querySelector("h1").innerText = nuovoTitolo;
};

changeTitle("Esercizi DOM Traversing e DOM Manupulation");

/* ESERCIZIO 2
 Scrivi una funzione per aggiungere al titolo della pagina una classe "myHeading"
*/

/* RISPOSTA */

 function addClassToTitle () {
    const titolo = document.querySelector("h1");
    titolo.classList.add("myHeading");
    return;
};

addClassToTitle();

/* ESERCIZIO 3
 Scrivi una funzione che cambi il testo dei p figli di un div
*/

function changePcontent (nuovoTesto) {
    document.querySelectorAll(" div > p").forEach(p => p.textContent = nuovoTesto);
    return;
}

changePcontent("nuovo testo paragrafo")

/* ESERCIZIO 4
 Scrivi una funzione che cambi la proprietà href di ogni link (tranne quello nel footer) con il valore https://www.google.com
*/

function cambioLink() {
    document.querySelectorAll("a :not(footer) a").forEach(link => {
        link.href = "https://www.google.com";
    });
    return;
}
cambioLink();


/* ESERCIZIO 5
 Scrivi una funzione che aggiunga un nuovo elemento lista alla seconda lista non ordinata
*/

 function addToTheSecond () {
    const secondaLista = document.getElementById("secondList");
    const elementoLista = document.createElement("li");

    elementoLista.textContent = " 4th elemento di lista aggiunto"
    secondaLista.appendChild(elementoLista);
}

addToTheSecond()


/* ESERCIZIO 6
 Scrivi una funzione che aggiunga un paragrafo al primo div
*/

const addParagraph = function () {
    const primoDiv = document.querySelector("div");
    const paragrafo = document.createElement("p");

    paragrafo.textContent = "Paragrafo aggiuntivo";
    primoDiv.appendChild(paragrafo);

}
addParagraph();

/* ESERCIZIO 7
 Scrivi una funzione che faccia scomparire la prima lista non ordinata
*/

function hideFirstUl () {
    const primaLista = document.getElementById("firstList");
    primaLista.style.display = "none";

}
hideFirstUl()

/* ESERCIZIO 8 
 Scrivi una funzione che renda verde il background di ogni lista non ordinata
*/

const paintItGreen = function () {
    const liste = document.querySelectorAll("ul");
    for (i = 0; i < liste.length; i++)
        liste[i].setAttribute("style", "background-color: green;")
}
paintItGreen()
/* ESERCIZIO 9
 Scrivi una funzione che rimuova l'ultima lettera dall'h1 ogni volta che l'utente lo clicca
*/

 function makeItClickable () {
const titolo = document.querySelector("h1");
titolo.addEventListener("click", function(){
    const testoAttuale = titolo.textContent;
    const nuovoTesto = testoAttuale.slice(0, -1);
    titolo.textContent = nuovoTesto;
    
});
titolo.style.cursor = "pointer";
}
makeItClickable ();

/* ESERCIZIO 10
 Crea una funzione che, al click sul footer, riveli l'URL del link interno come contenuto di un alert()
*/

/*function revealFooterLink () {
const footer = document.querySelector("footer");
footer.style.cursor = "pointer";
footer.addEventLink("click", function () {
    const footerLinkA = document.querySelector("footer a");
    const footerLink = footerLinkA.getAttribute("href");
    alert(footerLink);
});

}

/* ESERCIZIO 11
 Crea una funzione che crei una tabella nell'elemento con id "tableArea". 
 La tabella avrà 5 elementi e questa struttura: immagine, nome prodotto, quantità, prezzo
*/

const generateTable = function () {

}

/* ESERCIZIO 12
 Crea una funzione che aggiunga una riga alla tabella precedentemente creata e fornisca i dati necessari come parametri
*/

const addRow = function () { }

/* ESERCIZIO 14
Crea una funzione che nasconda le immagini della tabella quando eseguita
*/

const hideAllImages = function () { }

/* EXTRA ESERCIZIO 15
Crea una funzione che cambi il colore del h2 con id "changeMyColor" con un colore random ad ogni click ricevuto
*/

const changeColorWithRandom = function () { }



