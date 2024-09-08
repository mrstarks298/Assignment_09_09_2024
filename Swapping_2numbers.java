package assignment;

public class Swapping_2numbers {

    // Method to swap two numbers
    public static String swapping(int a, int b) {
        int temp;     // Temporary variable for swapping
        temp = a;     // Store the value of 'a' in temp
        a = b;        // Assign the value of 'b' to 'a'
        b = temp;     // Assign the value of 'temp' (original 'a') to 'b'

        // Return the swapped values as a string
        return "After swapping: a = " + a + ", b = " + b;
    }

    public static void main(String[] args) {
        // Initialize two numbers
        int a = 10;
        int b = 20;

        // Call the swapping method and print the result
        System.out.println(swapping(a, b));
    }
}
