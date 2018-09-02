package lesson16.task10;

import java.util.Scanner;

public class AssessStudent {
    public static double assssStudent() {
        Scanner sc = new Scanner(System.in);
        String[] assess = new String[5];
        assess[0] = "Математика";
        assess[1] = "Физика";
        assess[2] = "История";
        assess[3] = "ТММ";
        assess[4] = "Сопротивление материалов";
        double ball=0;
        //System.out.println("Вводим оценки студента - " + studentSet.getName());
        for (String a:assess){
            System.out.println("Введите оценку по предмету - "+ a);
            int i=sc.nextInt();
           ball=ball+i;
        }
        return ball=ball/5;
    }
}