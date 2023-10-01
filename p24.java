import java.util.*;

public class p24 {
    public static void main(String[] args) {
        int x, y, z;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Number 1: ");
            x = sc.nextInt();
            System.out.print("Enter Number 2: ");
            y = sc.nextInt();
            System.out.println();
            z = x / y;
        } catch (Exception e) {
            System.out.println("Error in input: " + e);
        }
        System.out.println();
        System.out.println("Id-22DCE069");
    }
}
