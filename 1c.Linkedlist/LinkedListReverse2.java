//Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())




package Linkedlist;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListReverse2 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Iterating in reverse order:");
        Iterator<String> reverseIterator = colors.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
