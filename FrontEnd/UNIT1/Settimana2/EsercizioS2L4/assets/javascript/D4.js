/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato.
*/

/*  RISPOSTA */
console.log(">>>>>> ESERCIZIO 1 <<<<<<")

function area(l1, l2) {
    return l1 * l2;
}

console.log("L'area del rettangolo è " + area(5, 10))

/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare 
 la loro somma moltiplicata per tre.
*/

/* RISPOSTA */
console.log(">>>>>> ESERCIZIO 2 <<<<<<")
function crazySum(numero1, numero2) {
    if (numero1 === numero2) {
        return (numero1 + numero2) * 3;
    } else
        return (numero1 + numero2);

}

console.log(crazySum(2, 2))

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

/*  RISPOSTA */
console.log(">>>>>> ESERCIZIO 3 <<<<<<")

function crazyDiff(numero) {
    let differenzaAssoluta = Math.abs(numero - 19);
    if (numero > 19) {
        return differenzaAssoluta *= 3;
    } else
        return differenzaAssoluta;
}

console.log(crazyDiff(21))


/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

/* RISPOSTA */
console.log(">>>>>> ESERCIZIO 4 <<<<<<")
function boundary(numeroIntero) {
    if (numeroIntero >= 20 && numeroIntero <= 100 || numeroIntero === 400) {
        return true
    } else return false;

}
console.log(boundary(400))


/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

/*  RISPOSTA */
console.log(">>>>>> ESERCIZIO 5 <<<<<<")
function epify(stringa) {

    if (stringa.startsWith("EPICODE ")) {
        return stringa;
    } else {
        return "EPICODE " + stringa;
    }

}


console.log(epify("EPICODE FS0124"));

/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

/*  RISPOSTA */
console.log(">>>>>> ESERCIZIO 6 <<<<<<")
function check3and7(numeroPositivo) {
    if (numeroPositivo % 3 === 0 || numeroPositivo % 7 === 0) {
        return " è un multiplo di 3 o 7";
    } else
        return " NON è un multiplo di 3 o 7";
}

console.log("Il numero" + check3and7(14))

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

/* RISPOSTA */
console.log(">>>>>> ESERCIZIO 7 <<<<<<")
function reverseString(stringa) {
    let stringaInversa = [];
    for (let i = 0; i < stringa.length; i++) {
        stringaInversa.unshift(stringa[i]);
    }
    return stringaInversa.join("");
}

let stringa = "BUONASERA A TUTTI"
console.log(reverseString(stringa));



/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/

/*  RISPOSTA */
console.log(">>>>>> ESERCIZIO 8 <<<<<<")

function upperFirst(stringa2) {
    let parole = stringa2.split(" ");
    for (let i = 0; i < stringa2.length; i++) {

    }
}


/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

/*  RISPOSTA */

function cutString(stringa3) {
    return stringa3.slice(1, - 1);
}

console.log(cutString("EPICODE"))


/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

/*  RISPOSTA */
console.log(">>>>>> ESERCIZIO 10 <<<<<<")
function giveMeRandom(n) {
    let numeri = [];
    for (i = 0; i < n; i++) {
        numeri.push(Math.ceil(Math.random() * 11));
    }
    return numeri;
}


console.log(giveMeRandom(3));
