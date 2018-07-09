package Lesson8;

public class Student {
    private String fistName;
    private String lastName;
    private String group;
    private double averageMark;

    public Student(String fistName, String lastName, String group, double averageMark) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public int getScolarship() {
        if (getAverageMark() == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
