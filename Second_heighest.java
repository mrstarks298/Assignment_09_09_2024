package assignment;

public class Second_heighest {

    public static int secondH(int[] arr) {
        // Initialize variables to store the largest and second largest
        int max = arr[0];
        int secondMax = -1;
        
        // First pass: Find the largest element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Second pass: Find the second largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max) { // Skip the largest element
                if (secondMax == -1 || arr[i] > secondMax) {
                    secondMax = arr[i];
                }
            }
        }
        
        return secondMax;
    }

    public static void main(String[] args) {
        // Example array
        int[] arr = {2, 6, 1, 8, 4, 9, 3};

        // Call the method to find the second-highest element
        int result = secondH(arr);

        // Print the result
        if (result == -1) {
            System.out.println("There is no second highest element.");
        } else {
            System.out.println("The second highest number is: " + result);
        }
    }
}
