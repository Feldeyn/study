package lesson10.task4;

public class TShirt extends Clothe implements MenClothe, WomenClothe {
    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    public void wearMen() {
        System.out.println("Рубашка размером -" + getSize() + ". Стоимость= " + getPrice() + ". Цвет - " + getColor());
    }

    public void wearWomen() {
        System.out.println("Рубашка размером -" + getSize() + ". Стоимость= " + getPrice() + ". Цвет - " + getColor());

    }
}
