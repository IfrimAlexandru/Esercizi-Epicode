/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato.
*/

/*  RISPOSTA */


function area (l1, l2) {
    return l1 * l2;
}

console.log("L'area del rettangolo è " + area(11, 12 ))

/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

/* RISPOSTA */

function crazySum (numero1, numero2) {
    if (numero1 === numero2) {
        return (numero1 + numero2) * 3;
    } else 
    return (numero1 + numero2);

}

console.log(crazySum(2, 2 ))

/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

/*  RISPOSTA */

function crazyDiff(numero) {
    let differenzaAssoluta = Math.abs(numero - 19);
    if (numero > 19) {
        differenzaAssoluta *= 3;
    } else
    return differenzaAssoluta;
}

console.log(crazyDiff(19))


/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

/* RISPOSTA */

/*  function boundary(numeroIntero) {
    if (numeroIntero >= 20 && numeroIntero <= 100) {
        return true
    } else ;

}  */


/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

/*  RISPOSTA */

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

function check3and7(numeroPositivo) {
    if (numeroPositivo % 3 === 0 || numeroPositivo % 7 === 0) {
        return " è un multiplo di 3 o 7";
    }
    return " NON è un multiplo di 3 o 7";
}  

console.log("Il numero" +  check3and7(21))

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

/* RISPOSTA */

function reverseString(stringa = "") {

}

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro un numero n e ritorna un'array contenente n numeri casuali inclusi tra 0 e 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
