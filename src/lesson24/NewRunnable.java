package lesson24;

public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i = i + 10) {
            if (i % 10 == 0) {
                System.out.println(i + "    " + "   Run by " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}