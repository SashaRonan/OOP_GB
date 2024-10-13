package Seminar_01.Ex001;

public class Bottle extends Product {

    private int volume;

    public Bottle(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}
