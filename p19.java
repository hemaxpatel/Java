public class p19 {
    public static void main(String[] args) {
        // square s = new square(3);
        square []s=new square[5];
        for (int i = 0; i < 5; i++) {
            s[i]=new square(3);
            s[i].print_area();
            s[i].print_peri();
        }
    }
}

class rectangle {
    int length = 0, breadth = 0;

    rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    void print_area() {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void print_peri() {
        System.out.println("Perimeter of Rectangle = " + (2 * (length + breadth)));
    }
}

class square extends rectangle {
    int side;

    square(int s) {
        super(s, s);
        side = s;
    }
}