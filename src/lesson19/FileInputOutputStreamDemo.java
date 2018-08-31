package lesson19;

import java.io.*;

public class FileInputOutputStreamDemo {
    public static void main(String[] args) {
        try (OutputStream output = new FileOutputStream("src\\lesson19\\a.txt");
             InputStream input = new FileInputStream("src\\lesson19\\a.txt")) {
            char[] c = {'a', 'b', 'c'};
            // Создание текстового файла
            for (char symbol : c) {
                output.write(symbol);
            }
            int size = input.available();
            for (int j = 0; j < size; j++) {
                // Чтение текстового файла посимвольно
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
