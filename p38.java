import java.util.*;

public class p38<T> {
    ArrayList<T> list = new ArrayList<T>();

    public p38() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getsize() {
        return list.size();
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return list.get(list.size() - 1);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        return list.remove(list.size() - 1);
    }

    public void push(T value) {
        list.add(value);
    }

    public static void main(String[] args) {
        p38 stack = new p38();

        int num, elements;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of to be insertend in the stack: ");
        num = sc.nextInt();
        System.out.println("Is Stack Empty: " + stack.isEmpty());
        System.out.println("Enter elements");
        for (int i = 0; i < num; i++) {
            elements = sc.nextInt();
            stack.push(elements);
        }
        System.out.println("Top element is " + stack.peek());
        System.out.println("Popped element is " + stack.pop());
        System.out.println("Is Stack Empty: " + stack.isEmpty());
        System.out.println("Size of the Stack is " + stack.getsize());
        System.out.println("Id-22DCE069");
    }
}
