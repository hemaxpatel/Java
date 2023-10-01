import java.util.*;

public class p20 {
    public static void main(String[] args) {
        Square S = new Square();
        S.Display();
        System.out.println("Id-22DCE069");
    }
}
class Shape {
    void Display() {
        System.out.println("This is Shape");
    }
}

class Rectangle extends Shape {
    void Display() {
        super.Display();
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void Display() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void Display() {
        super.Display();
        System.out.println("Square is a rectangle");
    }

}
