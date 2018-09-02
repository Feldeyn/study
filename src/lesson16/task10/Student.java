package lesson16.task10;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private String group;
    private int year;
    private double assess;

    public Student(String name, String group, int year, double assess) {
        this.name = name;
        this.group = group;
        this.year = year;
        this.assess = assess;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getYear() {
        return year;
    }

    public double getAssess() {
        return assess;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAssess(double assess) {
        this.assess = assess;
    }

    public int compareTo(Student anotheStudent) {
        int anotheStudentAssess = (int) anotheStudent.getAssess();
        return (int) this.getAssess() - anotheStudentAssess;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", year=" + year +
                ", assess=" + assess +
                '}';
    }

}
