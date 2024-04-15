const nome = document.getElementById("nomeInput");
const brand = document.getElementById("brandInput");
const prezzo = document.getElementById("prezzoInput");
const url = document.getElementById("urlInput");
const descrizione = document.getElementById("descrizioneInput");

const salva = document.getElementById("salva");
const reset = document.getElementById("reset");
const form = document.getElementById("formAdd");

const dataUrl = "https://striveschool-api.herokuapp.com/api/product/";
let articoli = [];
const token =
  "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2NWViNGQ5NjJkN2IxMTAwMTkwZTc5ZmQiLCJpYXQiOjE3MDk5MTk2MzgsImV4cCI6MTcxMTEyOTIzOH0.ztF5WUyipNCwpcFtiRRgPFd6p5TEs1qH7L0Vfu-uK7Y";

const aggiungiProdotto = async (nuovoProdotto) => {
  try {
    const carica = await fetch(dataUrl, {
      method: "POST",
      headers: {
        Authorization: token,
        "Content-Type": "application/json",
      },
      body: JSON.stringify(nuovoProdotto),
    });

    if (carica.ok) {
      console.log("Prodotto aggiunto con successo!");

      window.location.href = "index.html";
    } else {
      console.error("Errore durante l'aggiunta del prodotto:", carica.status);
      const errorMessage = await carica.text();
      console.error("Messaggio di errore:", errorMessage);
    }
  } catch (error) {
    console.error("Errore generico durante l'aggiunta del prodotto:", error);
  }
};

salva.addEventListener("click", async (e) => {
  e.preventDefault();

  if (!form.checkValidity()) {
    return window.alert("Riempi tutti i campi");
  }

  const nomeV = nome.value;
  const brandV = brand.value;
  const prezzoV = prezzo.value;
  const urlV = url.value;
  const descrizioneV = descrizione.value;

  const nuovoProdotto = {
    name: nomeV,
    brand: brandV,
    price: prezzoV,
    imageUrl: urlV,
    description: descrizioneV,
  };

  await aggiungiProdotto(nuovoProdotto);
});
