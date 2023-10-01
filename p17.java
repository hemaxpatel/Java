import java.util.*;

class Parent {
    public void parent() {
        System.out.println("This is Parent class.");
    }
}

class subClass extends Parent {
    public void subclass() {
        System.out.println("This is SubClass class.");
    }
}

public class p17 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.parent();
        subClass S = new subClass();
        S.subclass();
        S.parent();
        System.out.println("Id-22DCE069");
    }
}
