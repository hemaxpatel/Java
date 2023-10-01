class MyThread extends Thread {
    public MyThread(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " is running with priority " + getPriority());
    }
}

public class p36 {
    public static void main(String[] args) {
        MyThread firstThread = new MyThread("FIRST", 3);
        MyThread secondThread = new MyThread("SECOND", Thread.NORM_PRIORITY); // Default priority (5)
        MyThread thirdThread = new MyThread("THIRD", 7);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
        System.out.println("Id--22DCE069");
    }
}
