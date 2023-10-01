import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class p22 {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        n = sc.nextInt();
        int result = myCalculator.divisor_sum(n);
        System.out.println("The sum of divisors for " + n + " is: " + result);
        System.out.println("Id-22DCE069");
    }
}
