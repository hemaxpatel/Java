import java.util.*;
class complex{
    int ima,real;

    complex(int real, int ima){
        this.ima=ima;
        this.real=real;
    }

    public complex sum (complex c1, complex c2){
        complex temp=new complex(5,6);
        temp.real=c1.real+c2.real;
        temp.ima=c1.ima+c2.ima;
        return temp;
    }

    public complex diff (complex c1, complex c2){
        complex temp=new complex(3,4);
        temp.real=c1.real-c2.real;
        temp.ima=c1.ima-c2.ima;
        return temp;
    }

    public complex product (complex c1, complex c2){
        complex temp=new complex(8,9);
        temp.real=c1.real*c2.real;
        temp.ima=c1.ima*c2.ima;
        return temp;
    }

    public void display(){
        System.out.println("Complex number is "+real+"+"+ima+"i");
    }
}

public class p16{
    public static void main(String[] args) {
        complex c1 = new complex(5,6);
        complex c2 = new complex (3,4);
        c1.display();
        c2.display();
        complex c3=new complex (8,9);
        c3=c3.sum(c1,c2);
        System.out.print("Sum of two ");
        c3.display();
        c3=c3.diff(c1,c2);
        System.out.print("Difference of two ");
        c3.display();
        c3=c3.product(c1,c2);
        System.out.print("Product of two ");
        c3.display();
        System.out.println("Id-22DCE069");
    }
}