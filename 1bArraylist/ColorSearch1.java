//Write a java program for getting different colors through ArrayList interface and search whether
//the color "Red" is available or not

package Arraylist;
import java.util.ArrayList;

public class ColorSearch1 {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Adding different colors to the list
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        // Display the colors
        System.out.println("Available Colors: " + colors);

        // Search for "Red"
        if (colors.contains("Red")) {
            System.out.println("The color 'Red' is available in the list.");
        } else {
            System.out.println("The color 'Red' is NOT available in the list.");
        }
    }
}

