package lesson8;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Petrov", "12-v", 4.3);
        Aspirant aspirant1 = new Aspirant("Petya", "Frolov", "42-v", 5, "Eres");
        Student aspirant2 = new Aspirant("Vova", "Sidorov", "er-5", 4.7, "Utopia");
        System.out.println(aspirant2.getFistName() + " " + aspirant2.getLastName());
        System.out.println(aspirant1.getFistName() + " " + aspirant1.getLastName() + " " + aspirant1.getScienceWork());
        Student[] students = {student, aspirant1, aspirant2};
        for (Student s : students) {
            System.out.println(s.getLastName() + " " + s.getFistName() + " " + s.getScolarship());
        }
    }
}
