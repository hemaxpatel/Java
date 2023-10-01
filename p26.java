class CustomCheckedException extends Exception {
    public CustomCheckedException(String message) {
        super(message);
    }
}

class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String message) {
        super(message);
    }
}

public class p26 {

    public static void throwCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException("This is a checked exception.");
    }

    public static void throwUncheckedException() {
        throw new CustomUncheckedException("This is an unchecked exception.");
    }

    public static void main(String[] args) {
        try {

            throwCheckedException();
        } catch (CustomCheckedException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }
        try {
            throwUncheckedException();
        } catch (CustomUncheckedException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        } finally {
            System.out.println("Id-22DCE069");
        }
    }
}