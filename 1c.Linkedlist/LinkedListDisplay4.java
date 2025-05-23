//Write a Java program to display elements and their positions in a linked list ( using l_listobj.get(p) )


package Linkedlist;
import java.util.LinkedList;

public class LinkedListDisplay4 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Elements and their positions:");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Index " + i + ": " + colors.get(i));
        }
    }
}

