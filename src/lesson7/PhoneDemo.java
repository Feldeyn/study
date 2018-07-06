package lesson7;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Sony", "564164", 234);
        Phone phone2 = new Phone("Sony", "564164");
        Phone phone3 = new Phone();


        System.out.println("Номер - " + phone1.getNumber());
        System.out.println("Модель - " + phone1.getNumber());
        System.out.println("Вес - " + phone1.getWeight());
        phone1.reciveCall("Жена");
        System.out.println(phone1.getNumber());
        phone2.reciveCall("Теща", "561664164");
        phone1.sendMessage("5656656","656454");
        phone2.sendMessage("9999");
    }
}

