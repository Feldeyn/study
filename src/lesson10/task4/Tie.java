package lesson10.task4;

public class Tie extends Clothe implements MenClothe{
    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }
    public void wearMen(){
        System.out.println("Галстук размером -" + getSize() + ". Стоимость= " + getPrice() + ". Цвет - " + getColor());
    }
    }
