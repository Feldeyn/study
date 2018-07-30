package lesson10;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Печатаю книгу "+ getName());
    }

    public static void printBook (Printable[] printables){
        System.out.println("\n"+"Книги в наличии");
        for (Printable p: printables){
            if (p instanceof Book){
                Book b = (Book) p;
                System.out.println(b.getName());
            }
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return name != null ? name.equals(book.name) : book.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
