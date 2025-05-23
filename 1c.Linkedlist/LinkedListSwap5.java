//Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))



package Linkedlist;
import java.util.LinkedList;
import java.util.Collections;

public class LinkedListSwap5 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        System.out.println("Before swapping: " + colors);

        Collections.swap(colors, 0, 2); // swap first and third elements

        System.out.println("After swapping first and third elements: " + colors);
    }
}

