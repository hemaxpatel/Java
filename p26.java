import java.util.*;

public class p26{
    int createExp() throws ArithmeticException{
        int x  = 10/0;
        return x;
    }

    public void checkAge(int age){
        if(age<18)
            throw new ArithmeticException("Not Eligible for voting");

        else
            System.out.println("Eligible for voting");
    }

    public static void main(String[] args) {
       p26 obj = new p26();
       //for throws
        try{
            obj.createExp();
        }
        catch(ArithmeticException e){
            System.out.println("An error has occoured");
            e.printStackTrace();
        }
        int age;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter age: ");
        age=sc.nextInt();
        obj.checkAge(age);//for throw
    } 
}
