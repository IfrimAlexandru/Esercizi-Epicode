package it.epicode.Esercizio2;

public class UsaSim {
    public static void main(String[] args) {
        Sim sim = new Sim(312432423);
        sim.setCredito(10);

        Chiamata[] chiamate = new Chiamata[5];
        Chiamata c1 = new Chiamata(332453534, 2);
        Chiamata c2 = new Chiamata(332453654, 3);
        Chiamata c3 = new Chiamata(332453554, 4);
        Chiamata c4 = new Chiamata(332464534, 1);
        Chiamata c5 = new Chiamata(332742534, 6);

        chiamate[0]= c1;
        chiamate[1]= c2;
        chiamate[2]= c3;
        chiamate[3]= c4;
        chiamate[4]= c5;

        sim.setChiamate(chiamate);

        sim.stampaDatiSim();
    }
}
