import java.util.*;

public class p18 {
    public static void main(String[] args) {
        Manager M = new Manager();
        Employee E = new Employee();
        E.getData();
        System.out.println();
        E.Display();
        System.out.println();
        M.getData();
        System.out.println();
        M.Display();
        System.out.println("Id-22DCE069");
    }
}

class Member {
    String name;
    int age;
    String phone_number;
    String Address;
    float Salary;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter phone number:");
        phone_number = sc.nextLine();
        System.out.print("Enter Address: ");
        Address = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        System.out.print("Enter Salary: ");
        Salary = sc.nextFloat();
    }
}

class Manager extends Member {
    String speci = new String();

    void Display() {
        System.out.print("Enter Specification: ");
        Scanner sc = new Scanner(System.in);
        speci = sc.nextLine();
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phone_number);
        System.out.println("Address: " + Address);
        System.out.println("Salary: " + Salary);
        System.out.println("Specifications: " + speci);
    }
}

class Employee extends Member {
    String dep = new String("XYZ");

    void Display() {
        System.out.print("Enter Departement: ");
        Scanner sc = new Scanner(System.in);
        dep = sc.nextLine();
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phone_number);
        System.out.println("Address: " + Address);
        System.out.println("Slary: " + Salary);
        System.out.println("Depertment: " + dep);
    }
}

