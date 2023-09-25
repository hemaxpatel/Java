import java.util.*;

public class p18 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getmember();
        e.display();

        Manager m = new Manager();
        m.getmember();
        m.display();

        System.out.println("Id-22DCE069");
    }
}

class Member{
    Scanner s=new Scanner(System.in);
    String name,address,no;
    int age;
    float salary;

    public void getmember(){
        System.out.print("Enter name: ");
        name = s.nextLine();
        System.out.print("Enter phone number: ");
        no = s.nextLine();
        System.out.print("Enter address: ");
        address = s.nextLine();
        System.out.print("Enter age: ");
        age = s.nextInt();
        System.out.print("Enter salary: ");
        salary = s.nextFloat();
    }
}

class Employee extends Member{
    String department;

    void display(){
        // System.out.print("Enter department: ");
        // department = s.nextLine();
        String department = new String("Developer");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone number: "+no);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
        System.out.println("Department: "+department);
    }
}

class Manager extends Member{
    String specialization;

    void display(){
        // System.out.print("Enter specialization: ");
        // specialization = s.nextLine();
        String specialization = new String("Java");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Phone number: "+no);
        System.out.println("Address: "+address);
        System.out.println("Salary: "+salary);
        System.out.println("Specialization: "+specialization);
    }
}


