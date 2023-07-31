import java.util.*;

class Area{
    int length,breadth;

    Area(int l, int b){
        length=l;
        breadth=b;
    }

    public int returnArea(){
        return length*breadth;
    }
}

public class p15{
    public static void main(String[]args){
        int l,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        l=sc.nextInt();
        System.out.print("Enter breadth: ");
        b=sc.nextInt();
        Area a1= new Area(l,b);
        int area=a1.returnArea();
        System.out.println("Area is "+area);
        System.out.println("Id=22DCE069");
    }
}