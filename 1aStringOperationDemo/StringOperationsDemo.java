//Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
//and a LinkedList to perform the following operations with different functions directed as
//follows
//1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
//Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
//size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list



public class StringOperationsDemo {

    public static void main(String[] args) {
        // String Creation and Basic Operations
        String str1 = "AIET College";
        String str2 = "Engineering";
        System.out.println("Original String 1: " + str1);
        System.out.println("Original String 2: " + str2);

        // Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 3 of str1: " + str1.charAt(3));

        // String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase? " + str1.equalsIgnoreCase("aiet college"));

        // String Searching
        System.out.println("Index of 'College' in str1: " + str1.indexOf("College"));
        System.out.println("Does str1 contain 'AIET'? " + str1.contains("AIET"));

        // Substring Operations
        System.out.println("Substring from index 5 to 11: " + str1.substring(5, 11));

        // String Modification
        String replaced = str1.replace("College", "Institute");
        System.out.println("After replace: " + replaced);
        System.out.println("To Upper Case: " + str1.toUpperCase());
        System.out.println("To Lower Case: " + str1.toLowerCase());

        // Whitespace Handling
        String spaced = "   AIET   ";
        System.out.println("Original with spaces: '" + spaced + "'");
        System.out.println("Trimmed: '" + spaced.trim() + "'");

        // String Concatenation
        String full = str1.concat(" - ").concat(str2);
        System.out.println("Concatenated String: " + full);

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
        System.out.println("StringBuilder result: " + sb.toString());

        // String Formatting
        int year = 2025;
        String formatted = String.format("AIET welcomes batch of %d!", year);
        System.out.println("Formatted String: " + formatted);

        // Email Validation
        String email = "student@aiet.edu";
        boolean isValid = email.contains("@") && email.endsWith(".edu") && email.startsWith("student");
        System.out.println("Is email valid? " + isValid);
    }
}
