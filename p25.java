public class p25 {
    public static void main(String[] args) {
        try {
            int A = 10 / 0;
            System.out.println("Value of A: " + A);
        } catch (ArithmeticException e) {
            System.out.println("An exception occurred: " + e);
            e.printStackTrace();
        }
        System.out.println("Id-22DCE069");
    }
}
