package lesson8.task3.proffesions;

public class Driver {
    private String fistName;
    private String secondName;
    private String fatherName;
    private int experience;

    public Driver(String fistName, String secondName, int experience) {
        this.fistName = fistName;
        this.secondName = secondName;
        this.experience = experience;
    }

    public Driver(String fistName, String secondName, String fatherName, int experience) {
        this(fistName, secondName, experience);
        this.fatherName = fatherName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getFistName() {
        return fistName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
}
