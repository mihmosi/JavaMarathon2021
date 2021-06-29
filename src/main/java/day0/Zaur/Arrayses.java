package day0.Zaur;

import java.util.Arrays;

public class Arrayses {
    public static void main(String[] args) {
        String str = "Hello ";
        int[][] arr2;   /* объявление или Declaration */
        int[] arr1;
        arr2 = new int[3][];/*  размещение в памяти Allocation */
        arr1 = new int[2];

        arr2[0] = new int[5];
        arr2[1] = new int[2];
        arr2[2] = new int[7];

        arr1[0] = 3;  /* статическая инициализация */
        arr1[1] = 6;
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr2.length; i++) {         /* динамическая инициализаия Initialisation*/
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = i + j;
                System.out.println(arr2[i][j]);
            }
        }

        System.out.println(str.length());
        String arr[] = new String[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str + i;
            System.out.println(arr[i]);
        }


    }


}
