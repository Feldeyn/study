package lesson12;

public class Task4 {
    public static void main(String[] args) {
String k ="char";
String z="Practice";
obrezka(k);
obrezka(z);
    }
    public static void obrezka(String k){
        int z=k.length();
        String n =k.substring((z/2-1),(z/2+1));
        System.out.println(n);
    }
}
