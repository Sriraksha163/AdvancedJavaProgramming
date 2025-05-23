//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
//capitalizeWords()
public class CapitalizeWords3c6 {
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) return str;

        String[] words = str.split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        String input = "welcome to aiet college";
        System.out.println("Original: " + input);
        System.out.println("Capitalized: " + capitalizeWords(input));
    }
}
