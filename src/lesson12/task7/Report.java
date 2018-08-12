package lesson12.task7;

public class Report {
    public static void generateReport(Employee[] mas) {
        for (Employee e : mas) {
            System.out.printf("%-10s получает зарплату %20.2f %n", e.getFullname(), e.getSalary());
        }
    }
}
