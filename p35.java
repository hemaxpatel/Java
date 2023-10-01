import java.util.Random;

class IncrementByOne extends Thread {
    public void run() {
        Random r1 = new Random();
        while (true) {
            int random = r1.nextInt(100);
            System.out.println("Real Random number : " + random);
            System.out.println("\tRandom number with Increment One : " + (random + 1));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

public class p35 {
    public static void main(String[] args) {
        IncrementByOne obj = new IncrementByOne();
        obj.start();
        System.out.println("Id-22DCE069");
    }
}
