public class p20 {
    public static void main(String[] args) {
        Square s = new Square();
        s.print();
    }
}

class Shape {
    void print() {
        System.out.println("This is Shape This is Shape");
    }
}

class Rectangle extends Shape {
    void print() {
        super.print();
        System.out.println("This is Rectangular Shape");
    }
}

class Circle extends Shape {
    void print() {
        System.out.println("This is Circular Shape");
    }
}

class Square extends Rectangle
{
    void print()
    {
        super.print();
        System.out.println("Square is a Rectangle");
    }
}