//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
//appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify
//your answer which one is better.


public class StringPerformanceTest {
    public static void main(String[] args) {
        int iterations = 10000;

        // Using StringBuffer
        long startTimeSBuff = System.nanoTime();
        StringBuffer sbuff = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuff.append("AIET");
        }
        long endTimeSBuff = System.nanoTime();
        long durationSBuff = endTimeSBuff - startTimeSBuff;
        System.out.println("Time taken by StringBuffer: " + durationSBuff + " ns");

        // Using StringBuilder
        long startTimeSBuild = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sbuilder.append("AIET");
        }
        long endTimeSBuild = System.nanoTime();
        long durationSBuild = endTimeSBuild - startTimeSBuild;
        System.out.println("Time taken by StringBuilder: " + durationSBuild + " ns");

        // Justification
        if (durationSBuff > durationSBuild) {
            System.out.println("➡ StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("➡ StringBuffer is faster than StringBuilder.");
        }
    }
}
