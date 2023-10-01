class HelloWorldRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello, World! (Runnable)");
    }
}

public class p32_B {
    public static void main(String[] args) {
        HelloWorldRunnable runnable = new HelloWorldRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("Id-22DCE069");
    }
}
