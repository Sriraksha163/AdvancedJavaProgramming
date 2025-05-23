//Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
//function removeWhitespace()

package StringExercise;
public class WhitespaceRemover3b5 {
    // Q5: Remove all whitespace
    public static String removeWhitespace(String str) {
        if (str == null) return null;
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String input = " A I E T College ";
        System.out.println("Original: '" + input + "'");
        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
    }
}
