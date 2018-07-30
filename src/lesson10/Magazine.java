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
        System.out.println("Печатаю журнал " +getName());
    }
    public static void printMagazine(Printable [] printables){
        System.out.println();
    }
}
