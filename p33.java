import java.util.*;

public class p33 {
    public static int N;
    public static int numThreads;
    public static int[] a;
    public static int[] sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sum of Number : ");
        N = sc.nextInt();
        System.out.println("Enter a number of threads : ");
        numThreads = sc.nextInt();
        sc.close();
        a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = i + 1;
        }
        sum = new int[numThreads];
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new SumTask(i);
        }
        for (int i = 0; i < numThreads; i++) {
            threads[i].start();
        }
        for (int i = 0; i < numThreads; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int totalSum = 0;
        for (int i = 0; i < numThreads; i++) {
            totalSum += sum[i];
        }

        System.out.println("The total sum of " + N + " numbers is " + totalSum);
        System.out.println("Id-22DCE069");
    }

    private static class SumTask extends Thread {

        private int threadId;

        public SumTask(int threadId) {
            this.threadId = threadId;
        }

        public void run() {
            int start = threadId * (N / numThreads);
            int end = (threadId + 1) * (N / numThreads) - 1;

            int partialSum = 0;
            for (int i = start; i <= end; i++) {
                partialSum += a[i];
            }

            sum[threadId] = partialSum;
        }
    }
}
