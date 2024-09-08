package assignment;

import java.util.Arrays;

public class remove_dublicates_from_array {
    
    public static int[] dubli(int[] arr) {
        // Step 1: Sort the array (to handle duplicates easily)
        Arrays.sort(arr);
        
        // Step 2: Create a temporary array to hold unique elements
        int[] temp = new int[arr.length];
        int j = 0;
        
        // Step 3: Iterate through the array and copy unique elements to temp
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        
        // Adding the last element (which is always unique or hasn't been added yet)
        temp[j++] = arr[arr.length - 1];
        
        // Step 4: Copy the unique elements to a new array of correct size
        int[] uniqueArr = new int[j];
        for (int i = 0; i < j; i++) {
            uniqueArr[i] = temp[i];
        }
        
        return uniqueArr;
    }

    public static void main(String[] args) {
        // Example array with duplicates
        int[] arr = {3, 4, 7, 9, 3, 2, 12, 7,3};
        
        
        // Call the method to remove duplicates
        int[] uniqueArr = dubli(arr);
        
        // Print the result
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
    }
}
