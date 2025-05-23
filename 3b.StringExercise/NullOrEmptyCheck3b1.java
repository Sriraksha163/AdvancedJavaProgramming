//Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
//defined function isNullOrEmpty().



package StringExercise;
public class NullOrEmptyCheck3b1 {
    // Q1: Check null or only whitespace
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static void main(String[] args) {
        String test1 = null;
        String test2 = "   ";
        String test3 = "AIET";

        System.out.println("test1 is null or empty? " + isNullOrEmpty(test1)); // true
        System.out.println("test2 is null or empty? " + isNullOrEmpty(test2)); // true
        System.out.println("test3 is null or empty? " + isNullOrEmpty(test3)); // false
    }
}
