import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class p31 {
    public static void main(String[] args) {
        File fs = new File("File31.txt");
        try {
            fs.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }
        try {
            String Write1;
            BufferedWriter f_Writer = new BufferedWriter(new FileWriter("File31.txt"));
            System.out.println("If write a e so exit a stream");
            System.out.print("Enter a new string write in file : ");
            Scanner sc = new Scanner(System.in);
            while (true) {
                Write1 = sc.next();
                if (Write1.charAt(0) == 'e')
                    break;
                f_Writer.write(Write1);
                f_Writer.newLine();
            }
            System.out.println("Write successfull!! in File31.txt");
            sc.close();
            f_Writer.close();
        } catch (IOException e) {
            System.out.println("Something went a wrong..");
        }
        System.out.println("Id-22DCE069");
    }
}
