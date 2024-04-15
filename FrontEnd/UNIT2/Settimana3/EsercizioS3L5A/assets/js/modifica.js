const token =
  "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNGQ5NjJkN2IxMTAwMTkwZTc5ZmQiLCJpYXQiOjE3MDk5MTk2MzgsImV4cCI6MTcxMTEyOTIzOH0.ztF5WUyipNCwpcFtiRRgPFd6p5TEs1qH7L0Vfu-uK7Y";
const dataUrl = "https://striveschool-api.herokuapp.com/api/product/";

const elimina = document.getElementById("elimina");
const salva = document.getElementById("salva");
const reset = document.getElementById("reset");
const form = document.getElementById('form')

let id;
let articoli = [];

const nome = document.getElementById("nomeInput");
const brand = document.getElementById("brandInput");
const prezzo = document.getElementById("prezzoInput");
const url = document.getElementById("urlInput");
const descrizione = document.getElementById("descrizioneInput");

window.addEventListener("load", init);

const cercaFetch = async () => {
  try {
    const caricamento = await fetch(dataUrl, {
      headers: {
        Authorization: token,
      },
    });
    const response = await caricamento.json();
    articoli = response;
  } catch (error) {
    console.log(error);
  }
};

const cancellaArticolo = async (id) => {
  try {
    let risposta = await fetch(dataUrl + id, {
      method: "DELETE",
      headers: {
        Authorization: token,
        "Content-Type": "application/json",
      },
    });

    if (risposta.ok) {
      console.log(`Articolo con ID ${id} eliminato con successo`);
      window.location.href = "index.html";
    } else {
      console.error(
        `Errore durante la cancellazione dell'articolo con ID ${id}`
      );
    }
  } catch (error) {
    console.log(error);
  }
};

elimina.addEventListener("click", (e) => {
  e.preventDefault();
  let conferma = confirm("Sei sicuro di voler eliminare l'articolo?");
  if (id) {
    conferma = confirm(
      "L'articolo verrà eliminato definitivamente, proseguire?"
    );

    if (conferma) {
      cancellaArticolo(id);
    }
  } else {
    console.error("ID dell'articolo non valido o mancante");
  }
  if (conferma) {
    cancellaArticolo();
  }
});

function recuperoDati(id) {
  articoli.forEach((element) => {
    if (element._id == id) {
      nome.value = element.name;
      brand.value = element.brand;
      prezzo.value = element.price;
      descrizione.value = element.description;
      url.value = element.imageUrl;
    }
  });
}

async function init() {
  await cercaFetch();
  const urlParams = new URLSearchParams(window.location.search);
  id = urlParams.get("id");
  if (id) {
    recuperoDati(id);
  }
}

const aggiornaProdotto = async (nuovoProdotto) => {
    try {
        const carica = await fetch(dataUrl+id, {
            method: "PUT",
            headers: {
                "Authorization": token,
                "Content-Type": "application/json"
            },
            body: JSON.stringify(nuovoProdotto)
        });

        if (carica.ok) {
            console.log("Prodotto modificato con successo!");

            window.location.href = "index.html"
        } else {
            console.error("Errore durante la modifica del prodotto:", carica.status);
            const errorMessage = await carica.text();
            console.error("Messaggio di errore:", errorMessage);
        }

    } catch (error) {
        console.error("Errore generico durante la modifica del prodotto:", error);
    }
}

salva.addEventListener('click', async (e) => {
    e.preventDefault();
    if (!form.checkValidity()) {
      return (window.alert('Riempi tutti i campi'))
    }

    const nomeV = nome.value;
    const brandV = brand.value;
    const prezzoV = prezzo.value;
    const urlV = url.value;
    const descrizioneV = descrizione.value;

    const nuovoProdotto = { name: nomeV, brand: brandV, price: prezzoV, imageUrl: urlV, description: descrizioneV };

    await aggiornaProdotto(nuovoProdotto);
});