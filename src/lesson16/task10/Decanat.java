package lesson16.task10;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Decanat {
    public static void main(String[] args) {
        Set<Student> studentSet = new TreeSet<>();
        studentSet.add(new Student("Ivanov", "22-D", 2, AssessStudent.assssStudent()));
        /*studentSet.add(new Student("Petrov", "22-D", 2, 3.8));
        studentSet.add(new Student("Sidorov", "22-D", 2, 4.7));
        studentSet.add(new Student("Smirnov", "22-D", 2, 1.7));*/
        Set<Student> students = new TreeSet<>();
        for (Student s : studentSet) {
            if (s.getAssess() >= 3){
                students.add(s);
            }else {
                System.out.println("Студент "+s.getName()+ " отчислен" );
            }
        }
        printStudent(students);
    }
    public static void printStudent(Set<Student> students){
    for (Student s: students)
        System.out.println("Студент "+s.getName() +" переведен на "+(s.getYear()+1) +" курс");
    }
}
