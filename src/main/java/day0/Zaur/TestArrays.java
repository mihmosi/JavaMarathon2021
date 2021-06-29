package day0.Zaur;

import java.util.Arrays;

public class TestArrays {
    public static void main(String[] args) {

        String[][] str = new String[][]{{"Как", "однажды", "Жак"}, {"- звонарь", "городской"}, {"сломал", "фонарь", "- радуга"}};

        showArray(str);
        System.out.println();
        System.out.println(Arrays.deepToString(str));

        int array1[] = {1, 3, 5, -3, 2, 0, 2};
        int array2[] = {1, 3, 5, -3, 2, 0, 2};
        for (int elem : array1) {
            System.out.print(elem + " ");
        }
        System.out.print("\n");
//        Arrays.sort(array1);
        sorters(array1);
        for (int elem : array1) {
            System.out.print(elem + " ");
        }
        System.out.print("\n");

        int index1 = Arrays.binarySearch(array1, -2);
        System.out.println(index1 + " - Индекс нужного элемента в отсортированном массиве");

        sorters(array2);

        System.out.println();

        for (int elem : array2) {
            System.out.print(elem + " ");
        }

    }

    static void sorters(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    static void showArray(String[][] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
        }
        System.out.print("}");
    }
}
