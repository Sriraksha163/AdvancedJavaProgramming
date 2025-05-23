//Write a java program for getting different colors through ArrayList interface and delete nth
//element from the ArrayList object by using remove by index



import java.util.ArrayList;
import java.util.Scanner;

public class ColorDeleteNth5 {
    public static void main(String[] args) {
        // Create an ArrayList of color names
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display the original list
        System.out.println("Original Colors List: " + colors);

        // Take input for the index to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index (starting from 0) of the element to remove: ");
        int index = scanner.nextInt();

        // Check if the index is valid
        if (index >= 0 && index < colors.size()) {
            String removedColor = colors.remove(index);
            System.out.println("Removed color at index " + index + ": " + removedColor);
        } else {
            System.out.println("Invalid index! Please enter a number between 0 and " + (colors.size() - 1));
        }

        // Display the updated list
        System.out.println("Updated Colors List: " + colors);

        scanner.close();
    }
}
