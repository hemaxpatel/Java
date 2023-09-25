import java.util.*;

public class p24 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter Integer 1:");
            a=sc.nextInt();
            System.out.print("Enter Integer 2:");
            b=sc.nextInt();
            c=a/b;
        }

        catch(Exception e){
            System.out.println("Error in Input: "+e);
        }
    }
}
