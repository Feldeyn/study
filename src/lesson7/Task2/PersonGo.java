package lesson7.Task2;

public class PersonGo {
    public static void main(String[] args) {
        Person person1=new Person();
        Person person2=new Person("Aleksey", 23 );
        person2.talk();
        person1.move();
        System.out.println("Человека зовут "+person2.getFullname());
    }
}
