import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9}; // Example numbers
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Display the sorted array
        System.out.println("Numbers in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
