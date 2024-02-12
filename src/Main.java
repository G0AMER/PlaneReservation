
public class Main {

    static int nbplace = 1;

    public static void main(String[] args) throws InterruptedException {
        Client c1 = new Client();
        Client c2 = new Client();
        c1.start();
        c2.start();
        c1.join();
        c2.join();
        System.out.println(nbplace);
    }
}