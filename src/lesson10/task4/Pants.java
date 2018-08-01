package lesson10.task4;

public class Pants extends Clothe implements MenClothe, WomenClothe {
    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    public void wearMen() {
        System.out.println("Брюки размером -" + getSize() + ". Стоимость= " + getPrice() + ". Цвет - " + getColor());
    }

    public void wearWomen() {
        System.out.println("Брюки размером -" + getSize() + ". Стоимость= " + getPrice() + ". Цвет - " + getColor());
    }
}
