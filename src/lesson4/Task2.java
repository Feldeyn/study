package lesson4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner girlanda = new Scanner(System.in);
        int x;
        System.out.println("Введите число");
        x = girlanda.nextInt();
        miganie(x);
        stroka(x);
        vkluchenie(x);
        tecusee(x);
    }

     public static void miganie(int x) {
         Scanner mig = new Scanner(System.in);
         System.out.println("Введите количество миганий");
         int k = mig.nextInt();
         for (int i = 0; i < k; i++) {
             x = ~x;
             System.out.println(Integer.toBinaryString(x));
         }
     }
     public static void stroka (int x){
         Scanner stroca = new Scanner(System.in);
         System.out.println("Введите направление движения 1-направо, другая кнопка-налево");
         int i=stroca.nextInt();
         System.out.println("Введите на сколько переместится лампочки");
         int k = stroca.nextInt();
         if (i==1){
             x=x>>k;
             System.out.println(Integer.toBinaryString(x));
         } else {
             x=x<<k;
             System.out.println(Integer.toBinaryString(x));
         }
             }
    public static void vkluchenie(int x) {
        System.out.println(Integer.toBinaryString(x));
        x &= 1;
        if (x == 1) {
            System.out.println("Лампочка горит" );
        } else {
            System.out.println("Дампочка не горит" );
        }
    }
    public static void tecusee(int x){
        System.out.println(Integer.toBinaryString(x));
    }

}
