import java.io.*;
public class p30 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileCopy <source_file> <destination_file>");
            System.exit(1);
        }

        String sourceFileName = args[0];
        String destinationFileName = args[1];

        try (FileInputStream sourceFileInputStream = new FileInputStream(sourceFileName);
                FileOutputStream destinationFileOutputStream = new FileOutputStream(destinationFileName)) {

            int bufferSize;
            byte[] buffer = new byte[1024];

            while ((bufferSize = sourceFileInputStream.read(buffer)) > 0) {
                destinationFileOutputStream.write(buffer, 0, bufferSize);
            }

            System.out.println("File copied successfully from " + sourceFileName + " to " + destinationFileName);
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
        System.out.println("Id-22DCE069");
    }
}
