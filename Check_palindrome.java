package assignment;

public class Check_palindrome {
	
    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String inputString) {
        int start = 0;
        int end = inputString.length() - 1;
        
        while (start < end) {
            // Compare characters from start and end
            if (inputString.charAt(start) != inputString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        // The string to test
        String str = "maam";  // Use double quotes for strings in Java
        
        
        // Check if the string is a palindrome
        if (isPalindrome(str)) {  // Method name matches here
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
