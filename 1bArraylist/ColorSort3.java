//Write a java program for getting different colors through ArrayList interface and sort them
//using Collections.sort( ArrayListObj)


package Arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ColorSort3 {
    public static void main(String[] args) {
        // Create an ArrayList to store colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the ArrayList
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");

        // Display the original list
        System.out.println("Original Colors List: " + colors);

        // Sort the list in ascending order
        Collections.sort(colors);

        // Display the sorted list
        System.out.println("Sorted Colors List: " + colors);
    }
}
