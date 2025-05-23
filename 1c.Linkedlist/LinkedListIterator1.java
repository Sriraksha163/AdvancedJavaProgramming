//Write a Java program to iterate through all elements in a linked list starting at thespecified 
//position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))


package Linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator1 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Iterating from the 2nd position:");
        ListIterator<String> iterator = colors.listIterator(1); // starts from index 1 (2nd element)
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
