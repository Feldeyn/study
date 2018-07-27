package lesson8.task3.vehicles;

public class SportCar extends Car {
    private int maxSpeed;

    SportCar(String marka, String classCar, int weight, int maxSpeed) {
        super(marka, classCar, weight);
        this.maxSpeed = maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
}
