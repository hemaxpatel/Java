import java.util.*;
public class p3s {
    public static void main(String[] args) {
        float m,hr,min,sec;
        float speed;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the distance in meters:");
        m=sc.nextFloat();
        System.out.print("Enter the Time taken:\nHours: ");
        hr=sc.nextFloat();
        System.out.print("Minutes: ");
        min=sc.nextFloat();
        System.out.print("Seconds: ");
        sec=sc.nextFloat();

        speed=m/((hr*3600)+(min*60)+sec);
        System.out.println("\nSpeed is:\n"+speed+" m/s");

        speed=(m/1000)/(hr+(min/60)+(sec/3600));
        System.out.println(speed+" km/h");

        speed=(m/1609)/(hr+(min/60)+(sec/3600));
        System.out.println(speed+" mph");
        System.out.println("Id-22DCE069");
    }
}
