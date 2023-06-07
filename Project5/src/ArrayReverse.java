import java.util.Arrays;
public class ArrayReverse {
    public static void reverseArray(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }
        System.arraycopy(reversedArray, 0, array, 0, length);
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array");
        printArray(array);

        reverseArray(array);

        System.out.println("Reversed Array");
        printArray(array);
    }
}
