
const form = document.getElementById("formId");
const input = document.getElementById("inputId");
const list = document.getElementById("listId");

form.addEventListener("submit", function (event) {
    event.preventDefault(); // Evita l'invio del form

    const text = input.value.trim(); // Rimuovi spazi bianchi
        if (text !== "") { // Verifica se l'input non è vuoto
            const item = document.createElement("li");
            item.classList.add("todo-item");
            item.textContent = text;

          
            list.appendChild(item);

           input.value = ""; // Svuota l'input
        } else {
            alert("La casella di testo è vuota! Inserisci un'attività.");
        }
    });