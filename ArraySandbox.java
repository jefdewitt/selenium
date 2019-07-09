import java.util.Arrays;
import java.util.Comparator;

class ArraySandbox {

    /**
     * Here's some curios around Java's arrays
     * Arrays in Java must a defined length
     */
    public void arraySort(String[] array) {
        Arrays.sort(array);
        System.out.printf("The array has been sorted: %s%n", Arrays.toString(array));
    }

    public void arraySortByLengthAndReversed(String[] array) {
        Arrays.sort(array, Comparator.comparing(String::length).reversed());
        System.out.printf("The array has been sorted by length and then reversed: %s%n", Arrays.toString(array));
    }
}
