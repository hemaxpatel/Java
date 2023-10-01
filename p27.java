import java.io.*;
import java.util.*;

public class p27 {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < args.length; x++) {
            int y = 0;
            try {
                File fileobj = new File(args[x]);
                if (fileobj.exists()) {
                    System.out.println("Searching for file " + args[x]);
                    System.out.println(args[x] + " found");
                }
                Scanner sc = new Scanner(fileobj);
                while (sc.hasNextLine()) {
                    y++;
                    sc.nextLine();
                }
                System.out.println("There are " + y + " Lines in the " + args[x] + " File");
                sc.close();
            } catch (IOException e) {
                System.out.println("Error occured while finding the " + args[x] + " file");
            }
            System.out.println("Id-22DCE069");
        }
    }
}
