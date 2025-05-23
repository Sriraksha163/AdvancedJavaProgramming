//Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color "Blue" from the ArrayList



package Arraylist;
import java.util.ArrayList;

public class ColorRemoval2 {
    public static void main(String[] args) {
        // Create an ArrayList to store color names
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original Colors List: " + colors);

        // Remove the 2nd element (index 1)
        if (colors.size() > 1) {
            String removedColor = colors.remove(1); // removes "Green"
            System.out.println("Removed 2nd element (index 1): " + removedColor);
        }

        // Remove the color "Blue"
        boolean isBlueRemoved = colors.remove("Blue"); // removes by value

        if (isBlueRemoved) {
            System.out.println("Removed color 'Blue' from the list.");
        } else {
            System.out.println("Color 'Blue' was not found in the list.");
        }

        // Display the final list
        System.out.println("Final Colors List: " + colors);
    }
}
