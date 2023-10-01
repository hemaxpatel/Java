import java.util.*;

public class p21 {
    public static void main(String[] args) {
        Degree D = new Degree();
        Undergraduate U = new Undergraduate();
        Postgraduate P = new Postgraduate();

        P.getDegree();
        U.getDegree();
        System.out.println("Id-22DCE069");
    }
}

class Degree {
    void getDegree() {
        System.out.println("I got a Degree");
    }
}

class Undergraduate extends Degree {
    void getDegree() {
        super.getDegree();

        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    void getDegree() {
        super.getDegree();
        System.out.println("I am an Postgraduate");
    }
}
