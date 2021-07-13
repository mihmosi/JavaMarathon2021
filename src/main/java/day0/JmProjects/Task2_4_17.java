package day0.JmProjects;

public class Task2_4_17 {
    public static void main(String[] args) {
        int[] arr = {0, 55, -9,-4, 3, 1, 0, 0, 0};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j : arr) {
            if (j % 2 != 0) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(j);
            }
        }
        System.out.println(stringBuilder);
    }
}

