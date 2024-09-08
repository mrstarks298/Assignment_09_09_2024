package assignment;
import java.util.Arrays;  // Import for Arrays.toString()

public class Reverse_array {
    
    // Method to reverse the array using a while loop
    public static void reverse_arr(int[] arr) {
        int start = 0;
        int end = arr.length - 1;  // Correctly initialize 'end' to arr.length - 1
        
        while (start < end) {
            // Swap the elements at 'start' and 'end'
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Create an array
        int[] arr = {2, 3, 4, 7, 9};
        
        // Call reverse method
        reverse_arr(arr);
        
        // Print the reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
