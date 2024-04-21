package it.epicode;

public class Video extends ElementoMultimediale{
    private int luminosita;
    public Video(String titolo, int duration, int volume, int luminosita) {
        super(titolo, duration, volume);
        this.luminosita = luminosita;
    }
    public void play() {
        int contatore = 0;
        while(contatore < this.getDuration()) {
            String volume = "!".repeat(Math.max(0, this.getVolume()));
            String luminosita = "*".repeat(Math.max(0, this.luminosita));
            contatore++;
            System.out.println(this.getTitolo() + " " + volume + " "+ luminosita);
        }
    }
    public void alzaLuminosita(){
        if (this.luminosita < 10){
            this.luminosita += 1;
        }
    }
    public void abbassaLuminosita(){
        if (this.luminosita < 10){
            this.luminosita -= 1;
        }
    }
    public void aumentaVolume(){
        if (this.getVolume() < 10){
            this.setVolume(this.getVolume() + 1) ;
        }
    }
    public void diminuisciVolume(){
        if (this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 1);
        }
    }
}

