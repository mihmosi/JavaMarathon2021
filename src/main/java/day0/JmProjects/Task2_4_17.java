package day0.JmProjects;

public class Task2_4_17 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 20,101,99,-99,-101101,99,-99,-101};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                count++;
                if (count > 1) {
                    System.out.print(",");
                }
                System.out.print(j);
            }
        }
        System.out.println();
    }
}
