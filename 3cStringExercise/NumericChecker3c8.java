//Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
//function isNumeric()


public class NumericChecker3c8{
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String test1 = "123456";
        String test2 = "12a456";

        System.out.println(test1 + " is numeric? " + isNumeric(test1));
        System.out.println(test2 + " is numeric? " + isNumeric(test2));
    }
}
