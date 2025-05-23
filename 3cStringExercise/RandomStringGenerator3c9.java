//Q9. Write a Java Program for Creating a random string of a specified length using user defined
//function generateRandomString()

import java.util.Random;

public class RandomStringGenerator3c9 {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomString(int length) {
        if (length <= 0) return "";

        Random random = new Random();
        StringBuilder result = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            result.append(CHARACTERS.charAt(index));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Random string of length 10: " + generateRandomString(10));
    }
}
