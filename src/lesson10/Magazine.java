package lesson10;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Печатаю журнал " + getName());
    }

    public static void printMagazine(Printable[] printables) {
        System.out.println("\n" + "Журналы в наличии");
        for (Printable p : printables) {
            if (p instanceof Magazine) {
                Magazine m = (Magazine) p;
                System.out.println(m.getName());
            }
        }
    }
}
