package lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner trichisla= new Scanner (System.in);
        Double a,b,c;
        a=trichisla.nextDouble();
        b=trichisla.nextDouble();
        c=trichisla.nextDouble();
        double x=a<0? -a: a;
        double y=b<0? -b: b;
        double z=c<0? -c: c;
        double min;
        min = (x<y&&x<z)?x:(y<x&&y<z)?y:z;
        System.out.println(min);
    }
}
