
  const salva = document.getElementById("salva");
  const nome = document.getElementById("nome");
  const rimuovi = document.getElementById("rimuovi");
  const nomeSalvato = document.getElementById("nomeSalvato");

  salva.addEventListener("click", function (b) {
    b.preventDefault();
    if (nome.value.trim() == "") {
      alert("Inserisci un nome")
      return;
    }
    localStorage.setItem("nome", nome.value);
    alert("Nome salvato!");
    nomeSalvato.innerHTML = `Il nome salvato è ${nome.value}`
    nome.value = "";
  });

  rimuovi.addEventListener("click", function (b) {
    b.preventDefault();
    if (localStorage.getItem("nome")) {
      localStorage.removeItem("nome");
    nome.value = "";
    alert("Nome rimosso!");
    
    }
    nomeSalvato.classList.add('d-none')
  });

  const init = () => {
    if (localStorage.getItem('nome')) {
      nomeSalvato.classList.remove('d-none')
      nomeSalvato.innerText = `Il nome salvato è ${localStorage.getItem('nome')}`
    }
    let timer = sessionStorage.getItem('tempoSessione') || 0;
    const p = document.getElementById('tempoSessione');
    p.innerText = `Sei nella sessione da ${timer} secondi`;
    setInterval(() => {
      p.innerText = `Sei nella sessione da ${timer} secondi`;
      timer++;
      sessionStorage.setItem('tempoSessione', timer);
    }, 1000);
    
  }
  


window.addEventListener('load', init);