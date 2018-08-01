package lesson10.task2;

public class PlayDemo {
    public static void main(String[] args) {
        Instrument i1 = new Guitar(7);
        Instrument i2 = new Drum(12);
        Instrument i3 = new Trumpet(24);
        Instrument[] play = {i1, i2, i3};
        for (Instrument i : play) {
           i.play();
        }
    }
}