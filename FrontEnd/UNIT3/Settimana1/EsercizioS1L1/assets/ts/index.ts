interface Smartphone {
    credito: number;
    numeroChiamate: number;
    ricarica(ricarica: number): void;
    chiama404(): number;
    getNumeroChiamata(): number;
    azzeraChiamata(): void;

}

class User implements Smartphone {
    nome: string;
    cognome: string;
     credito: number;
    numeroChiamate: number;
    protected costoChiamate: 0.20;
    constructor(_nome: string, _cognome: string) {
        this.nome = _nome;
        this.cognome = _cognome;
        this.credito = 0;
        this.numeroChiamate = 0;
        this.costoChiamate = 0.20;
    }


    ricarica(ricarica: number): void {
        this.credito += ricarica
    }
    chiamata(minuti: number): void {
        this.numeroChiamate += minuti
        this.credito -= (minuti * this.costoChiamate)
    }
    chiama404(): number {
        return this.credito
    }
    getNumeroChiamata(): number {
        return this.numeroChiamate
    }
    azzeraChiamata(): void {
        this.numeroChiamate = 0;
    }
}

const Io = new User('Muzzu', 'Cirotto')
console.log('Utente creato: ' + Io.nome + ' ' + Io.cognome)
console.log('Credito iniziale: ' + Io.chiama404())
console.log('Minuti iniziali consumati: ' + Io.getNumeroChiamata())
Io.ricarica(10);
console.log('Ricarica di 10 euro effettuta')
console.log('Nuovo saldo: ' + Io.chiama404())
Io.chiamata(3);
console.log('Chiamata effettuata. Minuti consumati: '+Io.getNumeroChiamata())
console.log('Nuovo credito: '+Io.chiama404())