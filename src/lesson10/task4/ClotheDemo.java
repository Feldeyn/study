package lesson10.task4;

public class ClotheDemo {
    public static void main(String[] args) {
        Clothe c1 = new TShirt(Size.XS, 55, "green");
        Clothe c2 = new Pants(Size.XXS, 110, "grey");
        Clothe c3 = new Skirt(Size.L, 75, "blue");
        Clothe c4 = new Tie(Size.M, 27, "red");
        Clothe[] clothers = {c1, c2, c3, c4};
        Atelier.wearMen(clothers);
        Atelier.wearWomen(clothers);
    }
}
