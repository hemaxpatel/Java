import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class p28 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CharacterCount <input_file> <character>");
            System.exit(1);
        }
        String inputFile = args[0];
        char characterToCount = args[1].charAt(0);
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            int charCount = 0;
            int readChar;
            while ((readChar = reader.read()) != -1) {
                if (readChar == characterToCount) {
                    charCount++;
                }
            }
            System.out.printf("The character '%c' appears %d times in %s%n", characterToCount, charCount, inputFile);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        System.out.println("Id-22DCE069");
    }
}
