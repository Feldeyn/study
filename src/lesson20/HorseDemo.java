package lesson20;

import java.io.*;

public class HorseDemo implements Serializable {
    public static void main(String[] args) {
        Halter halter = new Halter("25");
        Horse horse = new Horse(halter);
        serializeHorse(horse);
        Horse horse2 = deserializeHorse();
        System.out.println(horse.equals(horse2));
    }

    public static Horse deserializeHorse() {
        Horse horse=null;
        try (FileInputStream fis = new FileInputStream("testSer.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            horse = (Horse) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return horse;
    }

    public static void serializeHorse(Horse horse) {
        try (FileOutputStream fs = new FileOutputStream("testSer.ser");
             ObjectOutputStream srlH = new ObjectOutputStream(fs)) {
           srlH.writeObject(horse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
