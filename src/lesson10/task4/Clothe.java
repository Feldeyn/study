package lesson10.task4;

public abstract class Clothe {
    private Size size;
    private int price;
    private String color;

    Clothe(Size size,int price, String color){
        this.color=color;
        this.price=price;
        this.size=size;
    }

    public Size getSize() {
        return size;
    }

    void setPrice(int price){
        this.price=price;
    }
    int getPrice(){
        return price;
    }
    String getColor(){
        return color;
    }
}
