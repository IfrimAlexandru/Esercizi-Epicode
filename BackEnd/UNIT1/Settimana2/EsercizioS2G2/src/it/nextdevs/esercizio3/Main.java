package it.nextdevs.esercizio3;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.inserisciContatto("Carla Russo", "123456");
        rubrica.inserisciContatto("Francesco Balestra", "7891011");
        rubrica.inserisciContatto("Ciro Muzzu", "12131415");

        rubrica.stampaRubrica();

        System.out.println(rubrica.cercaPerNome("Carla Russo"));
        System.out.println(rubrica.cercaPerTelefono("7891011"));

        rubrica.rimuoviContatto("Carla Russo");

        rubrica.stampaRubrica();
    }
}
