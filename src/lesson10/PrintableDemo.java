package lesson10;

public class PrintableDemo {
    public static void main(String[] args) {
        Printable book1 = new Book("Igra Prestolov");
        Printable book2 = new Book("Vedmak");
        Printable book3 = new Book("Uchenik ubiyzi");
        Printable magazine1 = new Magazine("Gum");
        Printable magazine2 = new Magazine("Mir fantastici");
        Printable[] printables = {book1, book2, book3, magazine1, magazine2};
        for (Printable b : printables) {
           b.print();
        }
    }
}
