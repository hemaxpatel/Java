import java.util.*;

class Date{
    int day,month,year;

    Scanner  sc = new Scanner(System.in);

    public void get(){
        System.out.print("Enter the day: ");
        day=sc.nextInt();
        System.out.print("Enter the month: ");
        month=sc.nextInt();
        System.out.print("Enter the year: ");
        year=sc.nextInt();
    }

    public void set(){
        System.out.println("Date is "+day+"-"+month+"-"+year);
    }

    public void DisplayDate(){
        System.out.println(day+"/"+month+"/"+year);
    }
} 

public class p14{
    public static void main(String[]args){
        Date d=new Date();
        d.get();
        d.set();
        d.DisplayDate();
        System.out.println("Id=22DCE069");
    }
}