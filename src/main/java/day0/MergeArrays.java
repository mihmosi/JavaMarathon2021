package day0;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 2, 3, 3};
        int[] arr2 = {1, 3, 5};

        int[] arr3 = mergeArrays(arr1, arr2);

        for (int item: arr3) {
            System.out.println(item);
        }

    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arrResult = new int[a1.length + a2.length];
        int x = 0, y = 0;

        for (int i = 0; i < arrResult.length; i++) {
            if (x >= a1.length ) {  /** если индекс первого массива arr1 равен его длине */
                arrResult[i] = a2[y];  /** то коппируем значения из второго массива соответственно инекса */
                y++;
            } else if (y >= a2.length) {
                arrResult[i] = a1[x];
                x++;
            } else if (a1[x] <= a2[y]) {
                arrResult[i] = a1[x];
                x++;
            } else if (a2[y] <= a1[x]) {
                arrResult[i] = a2[y];
                y++;
            }
        }

        return arrResult;
    }
}


//while (i < a1.length && j < a2.length) {
//            a3[k++] = a1[i] <= a2[j] ? a1[i++] : a2[j++];
//        }
//            if (i < a1.length - 1) {
//                System.arraycopy(a2, j, a3, k, a2.length - 1);
//            } else if (j < a2.length - 1) {
//                System.arraycopy(a1, i, a3, k, a1.length - 1);
//            }
//        return a3;