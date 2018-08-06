package kafedra;

public class Sostav {
    private Zvanie zar;
    private Dolgnost dolgnost;
    private String secondName;
    private String firstName;
    private int stagYear;

    Sostav(Zvanie zar, Dolgnost dolgnost, String secondName, String firstName, int stagYear) {
        this.dolgnost = dolgnost;
        this.secondName = secondName;
        this.firstName = firstName;
        this.stagYear = stagYear;
    }

    Sostav(Zvanie zar, String secondName, String firstName, int stagYear) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.stagYear = stagYear;
    }

        public Zvanie getZar() {
        return zar;
    }

    public Dolgnost getDolgnost() {
        return dolgnost;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setStagYear(int stagYear) {
        this.stagYear = stagYear;
    }

    public int getStagYear() {
        return stagYear;
    }

    public  void zarplata(Sostav[] perechen) {
        for (Sostav s : perechen) {
            System.out.println(secondName);
        }
    }
}
