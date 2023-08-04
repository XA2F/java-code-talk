import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9}; // declare our array of ints
        
        Arrays.sort(numbers); // Sort the numbers in ascending numbers

        System.out.print("Sorted Array: ");
        for (int number : numbers) {
            System.out.print(number + " "); // Print the number so the sorted array.
        }
    }
}
