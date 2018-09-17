package lesson24;

public class NewRunnableDemo {
    public static void main(String[] args) {
        NewRunnable nr=new NewRunnable();
        Thread thread1=new Thread(nr);
        Thread thread2=new Thread(nr);
        Thread thread3=new Thread(nr);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
