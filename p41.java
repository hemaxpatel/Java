import java.util.*;
import java.io.*;
public class p41 {
    public static void main(String[] args) throws IOException {
        String k[] = new String[] { "abstract", "continue", "default", "do", "double", "else", "return", "for" };
        HashSet<String> s = new HashSet<String>();
        for (int i = 0; i < k.length; ++i) {
            s.add(k[i]);
        }
        int count = 0;
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            count++;
            it.next();
        }
        for (int i = 0; i < k.length; i++) {
            System.out.print(k[i] + "  ");
        }
        System.out.println("\nTotal keywords are : " + count);
        System.out.println("Id-22DCE069");
    }
}
