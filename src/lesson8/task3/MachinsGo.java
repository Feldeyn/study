package lesson8.task3;

import lesson8.task3.proffesions.Driver;
import lesson8.task3.vehicles.Car;

public class MachinsGo {
    public static void main(String[] args) {
        Car machine1=new Car("BMW", "F - Представительский", 1780);
        Driver vtoroy = new Driver("Иван", "Петров", "Игоревич", 23);
        machine1.printInfo();
    }
}
