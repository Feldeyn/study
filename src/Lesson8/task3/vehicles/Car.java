package lesson8.task3.vehicles;

import lesson8.task3.proffesions.Driver;
import lesson8.task3.details.Engine;

public class Car {
    private String marka;
    private String classCar;
    private int weight;
    Driver perviy = new Driver("Igor", "Feofanov", 21);
    Engine motor1 = new Engine(2500, "Wolvo");

    public Car(String marka, String classCar, int weight) {
        this.marka = marka;
        this.classCar = classCar;
        this.weight = weight;
    }

    public void setMarka() {
        this.marka = marka;
    }

    public String getMarka(String marka) {
        return marka;
    }

    public void setClassCar() {
        this.classCar = classCar;
    }

    public String getClassCar(String classCar) {
        return classCar;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public int getWeight(int weight) {
        return weight;
    }

    void start(){
        System.out.println("Поехали");
    }
    void stop(){
        System.out.println("Останавливаемся");
    }
    void turnLeft(){
        System.out.println("Поворачиваем налево");
    }
    void turnRight(){
        System.out.println("Поворачиваем направо");
    }
    public void printInfo(){
        System.out.println("Автомобиль - "+ classCar+", " + marka+"      Весом - "+weight);
        System.out.println("Двигатель марки - "+motor1.getProduser()+", мощность - "+motor1.getPower());
        System.out.println("Водитель - "+ perviy.getSecondName()+perviy.getFistName()+" "+ "его стаж - "+ perviy.getExperience()+ " лет");
           }
}
