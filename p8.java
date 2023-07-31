import java.util.*;

public class p8 {
    public static void main(String[] args) {
        int n, count=0;
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the length of array: ");
        n = sc.nextInt();

        int a[]=new int[n];
        System.out.print("Enter array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        System.out.print("Enter no you want to find: ");
        int x = sc.nextInt();

        for(int i=0;i<n;i++){
            if(a[i]==x)
                count++;
        }
        System.out.println("Total occurence of "+x+" is "+count);
        System.out.println("Id-22DCE069");
    }
}
