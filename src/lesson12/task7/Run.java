package lesson12.task7;

public class Run {
    public static void main(String[] args) {
        Employee[] mas = new Employee[3];
        mas[0] = new Employee("Ivanov", 275);
        mas[1] = new Employee("Petrov", 306);
        mas[2] = new Employee("Sidorov", 234);
        Report.generateReport(mas);
    }
}
