package lesson7.Task4;

public class Reader {
    private String FIO;
    String Chitatelskiy;
    String Facultet;
    String DataR;
    String telef;

    Reader(String f, String c) {
        FIO = f;
        Chitatelskiy = c;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String Fio) {
        this.FIO = FIO;
    }

    void takeBook() {
        System.out.println("adf");
    }

    void takeBook(int k) {
        System.out.println(FIO + " взял " + k + " книг");
    }

    void takeBook(String... knig) {
        System.out.print(FIO + "Взял книги: ");
        for (String i : knig) {
            System.out.print(i + ", ");
        }
    }

    void returnBook(int k) {
        System.out.println('\n' + FIO + " вернул " + k + " книг.");
    }

    void returnBook(String... knigi) {
        System.out.print(FIO + " вернул книги: ");
        for (String i : knigi) {
            System.out.print(i + ", ");
        }
    }
}
