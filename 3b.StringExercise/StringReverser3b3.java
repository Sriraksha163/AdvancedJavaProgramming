//Q3. Write a Java Program for Reversing the characters in a string using user defined function
//reverseString().

package StringExercise;
public class StringReverser3b3 {
    // Q3: Reverse string
    public static String reverseString(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "AIET";
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverseString(input));
    }
}
