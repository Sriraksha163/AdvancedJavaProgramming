//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
//defined function truncate()


public class StringTruncator3c7 {
    public static String truncate(String str, int maxLength) {
        if (str == null || maxLength <= 0) return "";

        if (str.length() <= maxLength) {
            return str;
        } else if (maxLength <= 3) { // if maxLength too small, just return ellipsis or substring
            return "...".substring(0, maxLength);
        } else {
            return str.substring(0, maxLength - 3) + "...";
        }
    }

    public static void main(String[] args) {
        String input = "Artificial Intelligence and Emerging Technologies";
        System.out.println("Original: " + input);
        System.out.println("Truncated (20 chars): " + truncate(input, 20));
    }
}
