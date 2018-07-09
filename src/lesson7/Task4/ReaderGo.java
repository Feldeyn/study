package lesson7.Task4;

public class ReaderGo {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", "43125");
        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.returnBook(4);
        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
    }
}
