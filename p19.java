import java.util.*;

public class p19 {
    public static void main(String[] args) {
        square S = new square(10);
        System.out.println("Area:");
        S.Area();
        System.out.println("Perimeter");
        S.Perimeter();
        System.out.println("Id-22DCE069");
    }
}

class rectangle {
    Double length, width;

    rectangle(double l, double w) {
        length = l;
        width = w;
    }

    void Area() {
        System.out.println("Area of Rectangle is " + length * width);
    }

    void Perimeter() {
        System.out.println("Perimeter of Rectangle is " + 2 * (length + width));
    }
}

class square extends rectangle {
    square(double s) {
        super(s, s);
    }
    void Area() {
        super.Area();
        System.out.println("Area of Square is " + length * length);
    }

    void Perimeter() {
        super.Perimeter();
        System.out.println("Perimeter of Square is " + 4 * length);
    }

}