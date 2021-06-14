package day8;
/** */
public class TimeCounter {
    public static void timeCountMethod() {
        long startTime = System.currentTimeMillis();
        evaluatedMethod();
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime-startTime) + "ms");
    }

    private static void evaluatedMethod() {
    }
}
