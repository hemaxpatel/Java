import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class p29 {
    public static void main(String[] args) throws NullPointerException {
        System.out.print("Enter the word to search for: ");
        Scanner scanner = new Scanner(System.in);
        String wordToSearch = scanner.next();
        scanner.close();
        String fileName = "File29.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 0;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.contains(wordToSearch)) {
                    found = true;
                    System.out.println("Found '" + wordToSearch + "' in " + fileName + " at line " + lineNumber + ":");
                    System.out.println(line);
                }
            }
            if (!found) {
                System.out.println("The word '" + wordToSearch + "' was not found in " + fileName);
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        Integer number = 69;
        System.out.println("Wrapper class example: " + number);
        System.out.println("Id-22DCE069");
    }
}
