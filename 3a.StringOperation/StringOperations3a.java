//3a. Develop a java program for performing various string operations with different string
//handling functions directed as follows:
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
//String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
//startsWith() and endsWith()



public class StringOperations3a {
    public static void main(String[] args) {
        // String Creation and Basic Operations
        String str1 = "AIET College";
        String str2 = "Engineering";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 4 in str1: " + str1.charAt(4));

        // String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase(\"aiet college\")? " + str1.equalsIgnoreCase("aiet college"));

        // String Searching
        System.out.println("Does str1 contain 'AIET'? " + str1.contains("AIET"));
        System.out.println("Index of 'College' in str1: " + str1.indexOf("College"));

        // Substring Operations
        System.out.println("Substring of str1 from index 5 to 11: " + str1.substring(5, 11));

        // String Modification
        String modifiedStr = str1.replace("College", "Institute");
        System.out.println("After replacement: " + modifiedStr);
        System.out.println("str1 in upper case: " + str1.toUpperCase());
        System.out.println("str1 in lower case: " + str1.toLowerCase());

        // Whitespace Handling
        String spacedStr = "   Welcome to AIET   ";
        System.out.println("Original with spaces: '" + spacedStr + "'");
        System.out.println("After trim: '" + spacedStr.trim() + "'");

        // String Concatenation
        String concatStr = str1 + " - " + str2;
        System.out.println("Concatenated String: " + concatStr);

        // String Splitting
        String departments = "CSE,ECE,ISE,MECH,CIVIL";
        String[] deptArray = departments.split(",");
        System.out.println("Departments:");
        for (String dept : deptArray) {
            System.out.println("- " + dept);
        }

        // StringBuilder Demo
        StringBuilder sb = new StringBuilder("Welcome");
        sb.append(" to ").append("AIET");
        System.out.println("StringBuilder Result: " + sb.toString());

        // String Formatting
        int year = 2025;
        String formatted = String.format("AIET welcomes batch of %d!", year);
        System.out.println("Formatted String: " + formatted);

        // Validate Email
        String email = "student@aiet.edu";
        boolean isValidEmail = email.contains("@") && email.startsWith("student") && email.endsWith(".edu");
        System.out.println("Email: " + email);
        System.out.println("Is email valid? " + isValidEmail);
    }
}

