package lesson15;

public class TreeGenTest {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        TreeGen<Double,Dog,Integer> tvk=new TreeGen<>(25.95,dog1,15);
        tvk.showTipes();
    }
}
