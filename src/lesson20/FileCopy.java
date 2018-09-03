package lesson20;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {
        try (BufferedReader fileIn = new BufferedReader(new FileReader("src\\lesson20\\file.txt"));
             BufferedWriter fileOut = new BufferedWriter(new FileWriter("src\\lesson20\\copied_file.txt"))) {
            String a;
            // Копирование содержимого файла file.txt
            while ((a = fileIn.readLine()) != null) {
                // Чтение содержимого файла file.txt и запись в copied_file.txt
                fileOut.write(a);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


