package lesson19;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class WriterReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src\\lesson19\\a.txt"); FileWriter fw = new FileWriter("src\\lesson19\\b.txt")) {
            char[] ch = new char[50];
            int size = fr.read(ch);
            for (int i = 0; i < size; i++) {
                fw.write(ch[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
