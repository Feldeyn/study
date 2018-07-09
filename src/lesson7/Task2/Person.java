package lesson7.Task2;

public class Person {
    private String fullname;
    private int age;

    Person() {
    }

    Person(String f, int a) {
        fullname = f;
        age = a;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void move() {
        System.out.println("Человек " + fullname + " идет!");
    }

    void talk() {
        System.out.println("Человек " + fullname + " говорит");
    }
    void howOld(){
        System.out.println("Человеку "+age+" лет");
    }
}
