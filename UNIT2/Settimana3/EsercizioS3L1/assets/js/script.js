// 1. Crea una classe User per la creazione di oggetti di tipo “utente”. Il suo costruttore dovrà inizializzare ogni oggetto utente con i seguenti attributi:
// - firstName
// - lastName
// - age
// - location
// Aggiungi alla classe User anche un metodo che restituisca il confronto con l'età di un'altra persona. Ad esempio, date due istanze della classe utente “x” e “y” inizializzate con le proprietà sopra descritte, il metodo dovrà restituire una frase simile a “x è più vecchio di y” a seconda del risultato del confronto.
// Crea degli oggetti a partire dalla classe User e verifica che la comparazione tra le età funzioni correttamente.

// 2. Crea un form per la creazione di oggetti “Pet” (animali domestici). La classe Pet dovrà essere dotata delle seguenti proprietà:
// - petName
// - ownerName
// - species // (cane, gatto, coniglio etc.)
// - breed // (labrador, soriano, nano etc.)
// Nella classe che utilizzerai per creare questi oggetti aggiungi anche un metodo che restituisca true se due animali condividono lo stesso padrone. Crea, raccogliendo i dati dal form, diverse istanze della classe Pet e mostrane i dati in una lista sottostante.

// esercizio 1
class User {
  constructor(_firstName, _lastName, _age, _location) {
    (this.firstName = _firstName),
      (this.lastName = _lastName),
      (this.age = _age),
      (this.location = _location)
  }
  confrontoEta(e) {
    if (this.age > e.age) {
      return `${this.firstName} è più vecchio di ${e.firstName}`;
    } else if (this.age < e.age) {
      return `${this.firstName} è più giovane di ${e.firstName}`;
    } else {
      return `${this.firstName} ha la stessa età di ${e.firstName}`;
    }
  }
}

const utenteX = new User("Mario", "Rossi", 30, "Roma");
const utenteY = new User("Fabio", "Bianchi", 24, "Firenze");

console.log(utenteX.confrontoEta(utenteY));

//esercizio 2

class Pet {
  constructor(_petName, _ownerName, _species, _breed) {
    (this.petName = _petName),
      (this.ownerName = _ownerName),
      (this.species = _species),
      (this.breed = _breed)
  }
  ownerCheck = function(_pet2){
    return this.ownerName === _pet2.ownerName ? true : false;
  }
}

const pet1 = new Pet('Fido', 'Alice', 'Dog', 'Labrador');
const pet2 = new Pet('Whiskers', 'Marco', 'Dog', 'Pitbull');
const pet3 = new Pet('Buddy', 'Alice', 'Dog', 'Golden Retriever');

console.log(pet1.ownerCheck(pet3));
console.log(pet1.ownerCheck(pet2));

const Pets = [];

const inserisci = document.getElementById('inserisci')
const form = document.getElementById('form')
inserisci.addEventListener('click', (e) => {
    e.preventDefault();
    if (!form.checkValidity()) {
        return
    }
    const petName = document.getElementById('petName')
    const ownerName = document.getElementById('ownerName')
    const species = document.getElementById('species')
    const breed = document.getElementById('breed')
    const animal = new Pet(petName.value, ownerName.value, species.value, breed.value)
    Pets.push(animal)
    generaLista()
    petName.value = '';
    ownerName.value = '';
    species.value = '';
    breed.value = '';
})

const generaLista = () => {
    const tabella = document.getElementById('tabella')
    tabella.innerHTML = '';
    Pets.forEach((element) => {
        const row = document.createElement('div');
        row.classList.add('row')
        const colPetName = document.createElement('div');
        colPetName.classList.add('col-3', 'text-center', "border", "border-1")
        colPetName.innerText = element.petName
        const colOwnerName = document.createElement('div');
        colOwnerName.classList.add('col-3', 'text-center', "border", "border-1")
        colOwnerName.innerText = element.ownerName
        const colSpecies = document.createElement('div');
        colSpecies.classList.add('col-3', 'text-center', "border", "border-1")
        colSpecies.innerText = element.species
        const colBreed = document.createElement('div');
        colBreed.classList.add('col-3', 'text-center', "border", "border-1")
        colBreed.innerText = element.breed
        row.append(colPetName, colOwnerName, colSpecies, colBreed)
        tabella.appendChild(row)
    })
}

