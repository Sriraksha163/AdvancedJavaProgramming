//Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()


package Arraylist;
import java.util.ArrayList;
import java.util.List;

public class ColorSubList4 {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original Colors List: " + colors);

        // Extract 1st and 2nd elements using subList (index 0 to 2)
        List<String> subColors = colors.subList(0, 2); // includes index 0 and 1

        // Display the extracted sublist
        System.out.println("Extracted Sublist (1st and 2nd elements): " + subColors);
    }
}
