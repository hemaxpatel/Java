class HelloWorldThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello, World! (Thread)");
    }
}

public class p32_A {
    public static void main(String[] args) {
        HelloWorldThread thread = new HelloWorldThread();
        thread.start();
        System.out.println("Id-22DCE069");
    }
}
