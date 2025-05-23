//2 a. Develop a java program for performing various string operations with different string//
//handling functions directed as follows
//String Creation and Basic Operations, Length and Character Access, String Comparison, String
//Searching, Substring Operations , String Modification, Whitespace Handling, String
//Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
//contains( ) and startsWith() and endsWith()


import java.util.*;

public class ListOperationsDemo {
    public static void main(String[] args) {
        // 1. Adding elements
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        addElements(arrayList);
        addElements(linkedList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        linkedList.add(1, "Mango");

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Grapes");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);

        // 4. Accessing elements
        System.out.println("Accessed from ArrayList: " + arrayList.get(2));
        System.out.println("Accessed from LinkedList: " + linkedList.get(2));

        // 5. Updating elements
        arrayList.set(2, "Cherry");
        linkedList.set(2, "Cherry");

        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");

        // 7. Searching elements
        System.out.println("Apple in ArrayList? " + arrayList.contains("Apple"));
        System.out.println("Apple in LinkedList? " + linkedList.contains("Apple"));

        // 8. List size
        System.out.println("Size of ArrayList: " + arrayList.size());
        System.out.println("Size of LinkedList: " + linkedList.size());

        // 9. Iterating over list (for-each loop)
        System.out.println("ArrayList Elements:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        System.out.println("LinkedList Elements:");
        for (String item : linkedList) {
            System.out.println(item);
        }

        // 10. Using Iterator
        System.out.println("ArrayList using Iterator:");
        Iterator<String> iterator1 = arrayList.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println("LinkedList using Iterator:");
        Iterator<String> iterator2 = linkedList.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("Sorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);

        // 12. Sublist
        System.out.println("Sublist of ArrayList: " + arrayList.subList(1, 3));
        System.out.println("Sublist of LinkedList: " + linkedList.subList(1, 3));

        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
        System.out.println("LinkedList after clearing: " + linkedList);
    }

    private static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
    }
}
