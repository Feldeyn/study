package lesson8.task3.vehicles;

public class Lorry extends Car {
    private int carrying;

    Lorry(String marka, String classCar, int weight, int carrying) {
        super(marka, classCar, carrying);
        this.carrying = carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }
}
