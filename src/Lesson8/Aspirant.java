package lesson8;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String fistName, String lastName, String group, double averageMark, String scienceWork) {
        super(fistName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {

        return scienceWork;
    }

    public int getScolarship() {
        if (getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
