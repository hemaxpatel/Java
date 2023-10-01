import java.util.Random;

class Randomnumber extends Thread {
    public void run() {
        Random r1 = new Random();
        while (true) {
            int random = r1.nextInt(100);
            System.out.println("Random Number is " + random);
            if (random % 2 == 0) {
                SquareThread square = new SquareThread(random);
                square.start();
            } else {
                CubeThread cube = new CubeThread(random);
                cube.start();
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

class SquareThread extends Thread {
    int num;

    SquareThread(int n) {
        num = n;
    }

    public void run() {
        System.out.println("Square of Number is " + (num * num));
    }
}

class CubeThread extends Thread {
    int num;

    CubeThread(int n) {
        num = n;
    }
    public void run() {
        System.out.println("Cube of Number is " + (num * num * num));
    }
}

class p34 {
    public static void main(String[] args) {
        Randomnumber obj = new Randomnumber();
        obj.start();
        System.out.println("Id-22DCE069");
    }
}
