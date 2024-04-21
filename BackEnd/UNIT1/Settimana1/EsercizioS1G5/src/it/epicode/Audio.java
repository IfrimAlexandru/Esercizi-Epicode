package it.epicode;

public class Audio extends ElementoMultimediale  {
    public Audio(String titolo, int duration, int volume) {
        super(titolo, duration, volume);

    }
    @Override
    public void play() {
        int contatore = 0;
        while(contatore < this.getDuration()) {
            String volume = "!".repeat(Math.max(0, this.getVolume()));
                    contatore++;
            System.out.println(this.getTitolo() + " " + volume);
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
