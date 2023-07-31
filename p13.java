import java.util.*;

class Employee{
    String firstname, lastname;
    double salary;

    public void get(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstname=sc.nextLine();
        System.out.print("Enter last name: ");
        lastname=sc.nextLine();
        System.out.print("Enter salary: ");
        salary=sc.nextDouble();
        if(salary<0)
            salary=0.0;
    }

    public void set(){
        System.out.println("Name is "+firstname+" "+lastname);
        System.out.println("Salary is "+salary);
    }

    public void raise(int percentage){
        double per=(percentage*salary)/100;
        salary+=per;
        System.out.println("Salary after 10% raise is "+salary);
    }
}

public class p13{
    public static void main(String[] args){
        Employee Harsh= new Employee();
        Employee Het= new Employee();
        Harsh.get();
        Harsh.set();
        Harsh.raise(10);
        Het.get();
        Het.set();
        Het.raise(10);
        System.out.println("Id=22DCE069");
    }
}
