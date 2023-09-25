public class p21 {
    public static void main(String[] args) {
        Degree d = new Degree();
        Undergraduate u = new Undergraduate();
        Postgraduate p = new Postgraduate();
        d.getDegree();
        u.getDegree();
        p.getDegree();
    }
}

class Degree {
    void getDegree() {
        System.out.println("I got a Degree");
    }
}

class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    void getDegree() {
        super.getDegree();
        System.out.println("I am an Postgraduate");
    }
}