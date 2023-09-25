class Parent{
    public void parent(){
        System.out.println("This is Parent class");
    }
}

class Child extends Parent{
    public void child(){
        System.out.println("This is Child class");
    }
}

public class p17 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.parent();

        Child c = new Child();
        c.parent();
        c.child();
    }
}
