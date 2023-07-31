import java.util.Scanner;

public class p5{
    public static void main(String args[]){
        short code[]={1,2,3,4,5};
        int price[]={100,200,300,400,500};
        int c,rs=0;
        double tax[]={8,12,5,7.5,3};
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Motor\n2.Fan\n3.Tube\n4.Wire\n5.Other");
        System.out.print("\nEnter product code:");
        c=sc.nextInt();
        switch(c){
            case 1:
                rs=(int)(price[c-1]+price[c-1]*tax[c-1]/100);
                break;

            case 2:
                rs=(int)(price[c-1]+price[c-1]*tax[c-1]/100);
                break;  
                
            case 3:
                rs=(int)(price[c-1]+price[c-1]*tax[c-1]/100);
                break;

            case 4:
                rs=(int)(price[c-1]+price[c-1]*tax[c-1]/100);
                break;

            case 5:
                rs=(int)(price[c-1]+price[c-1]*tax[c-1]/100);
                break;
        }
        System.out.println("Bill is Rs"+rs+"/- only");
        System.out.println("Id-22DCE069");
    }
}