package it.epicode;

public abstract class ElementoMultimediale {
    private String titolo;
    private int duration, volume;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }
    public ElementoMultimediale(String titolo, int duration, int volume) {
        this.titolo = titolo;
        this.duration = duration;
        this.volume = volume;
    }
    public String getTitolo() {
        return this.titolo;
    }
    public int getDuration() {
        return this.duration;
    }
    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void play(){}
    public void show(){}
}
