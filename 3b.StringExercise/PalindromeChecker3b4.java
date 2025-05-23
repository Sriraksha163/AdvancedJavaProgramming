//Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
//and punctuation) using user defined function isPalindrome():


package StringExercise;
public class PalindromeChecker3b4 {
    // Q4: Check palindrome ignoring case and punctuation
    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        // Remove non-alphanumeric chars and convert to lowercase
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "AIET";

        System.out.println("'" + test1 + "' is palindrome? " + isPalindrome(test1)); // true
        System.out.println("'" + test2 + "' is palindrome? " + isPalindrome(test2)); // false
    }
}

