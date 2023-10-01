import java.util.Arrays;
public class p39 {
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array);
    }
    public static void main(String[] args) {
        Integer[] intArray = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        sortArray(intArray);
        System.out.println("Sorted Integer Array: " + Arrays.toString(intArray));
        String[] strArray = { "apple", "banana", "cherry", "date", "blueberry" };
        System.out.println("Original String Array: " + Arrays.toString(strArray));
        sortArray(strArray);
        System.out.println("Sorted String Array: " + Arrays.toString(strArray));
        System.out.println("Id-22DCE069");
    }
}
