//Q2. Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()

package StringExercise;
public class SubstringCount3b2{
    // Q2: Count occurrences of substring
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) return 0;
        int count = 0;
        int index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length();
        }

        return count;
    }

    public static void main(String[] args) {
        String mainStr = "banana";
        String subStr = "ana";

        System.out.println("Occurrences of '" + subStr + "' in '" + mainStr + "': " + countOccurrences(mainStr, subStr));
    }
}
