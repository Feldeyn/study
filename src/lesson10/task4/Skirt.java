package lesson10.task4;

public class Skirt extends Clothe implements WomenClothe {
    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    public void wearWomen() {
        System.out.println("Юбка размером -" + getSize() + ". Стоимость= " + getPrice() + ". Цвет - " + getColor());
    }
}
