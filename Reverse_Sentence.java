package assignment;

public class Reverse_Sentence {

    public static void main(String[] args) {
        String str1 = "saurabh is a good guy";

        // 1. Reverse the entire sentence
        System.out.println("Reversed sentence is: " + reverse_sen(str1));

        // 2. Reverse each word in the sentence without changing word order
        System.out.println("Reversed words (keeping sequence) is: " + reverseWords(str1));
        
        // 3. Reverse the order of words in the sentence without changing the characters in each word
        System.out.println("Words reversed (word order changed) is: " + reverseWordOrder(str1));
    }

    // Function to reverse the entire sentence
    public static String reverse_sen(String str2) {
        String str3 = "";
        int len = str2.length() - 1;
        for (int i = len; i >= 0; i--) {
            str3 = str3 + str2.charAt(i);
        }
        return str3;
    }

    // Function to reverse each word in the sentence without changing their order
    public static String reverseWords(String str2) {
        String str3 = "";  // Final result string to store reversed words
        String currentWord = "";  // Temporary string to store characters of the current word

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch != ' ') { 
                currentWord = ch + currentWord;  // Build the word in reverse
            } else {
                str3 = str3 + currentWord + " ";  // Append reversed word and space
                currentWord = "";  // Reset current word for the next one
            }
        }

        // Append the last word (as there is no space at the end)
        str3 = str3 + currentWord;

        return str3;
    }

    // Function to reverse the order of words in the sentence (but not the characters in each word)
    public static String reverseWordOrder(String str2) {
        String result = "";  // Final result string to store reversed word order
        String currentWord = "";  // Temporary string to store each word

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if (ch != ' ') {
                currentWord = currentWord + ch;  // Build the current word
            } else {
                result = currentWord + " " + result;  // Prepend the current word to result (reverse order)
                currentWord = "";  // Reset current word for the next one
            }
        }                     

        // Add the last word to the result (since there is no space at the end)
        result = currentWord + " " + result;

        // Trim any extra space at the end
        return result.trim(); 
    }
    
    
}
