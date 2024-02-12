import java.util.concurrent.Semaphore;

public class Client extends Thread {
    static Semaphore s = new Semaphore(1);

    public void run() {
        try {
            s.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        reserver();
        s.release();
    }

    void reserver() {
        if (Main.nbplace > 0) {
            Main.nbplace--;
            System.out.println("done");
        } else {
            System.out.println("ya hammadi 5ali tayara tos5on");

        }
    }
}
