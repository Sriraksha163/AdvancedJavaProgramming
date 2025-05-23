//Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast("Pink"))


package Linkedlist;
import java.util.LinkedList;

public class LinkedListofferLast3 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.offerLast("Pink"); // inserts "Pink" at the end

        System.out.println("LinkedList after inserting 'Pink' at the end:");
        System.out.println(colors);
    }
}

