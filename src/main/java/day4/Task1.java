package day4;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
//1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
// указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
// содержимое массива в консоль, а также вывести в консоль информацию о:
//        а) Длине массива
//        б) Количестве чисел больше 8
//        в) Количестве чисел равных 1
//        г) Количестве четных чисел
//        д) Количестве нечетных чисел
//        е) Сумме всех элементов массива
public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0;i < arr.length;i++) {
            arr[i] = rand.nextInt(11);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Длина массива "+arr.length);

        int count = 0;
        for (int i=0;i< arr.length;i++) {
             if (arr[i]>0) {
                 count++;
             }
        }
        System.out.println("Больше нуля "+count);

        int count1 = 0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i]==1) {
                count1++;
            }
        }
        System.out.println("Равно единице "+count1);

        int count2 = 0;
        for (int i=0;i< arr.length;i++) {
            if ((arr[i] % 2) == 0) {
//                System.out.println(i);
                count2++;
            }
        }
        System.out.println("Четных чисел "+count2);

        int count3 = 0;
        for (int i=0;i< arr.length;i++) {
            if ((arr[i] % 2) != 0) {
//                System.out.println(i);
                count3++;
            }
        }
        System.out.println("НЕ Четных чисел "+count3);

        int sum = 0;
        for (int i=0;i< arr.length;i++) {
                sum += arr[i];
        }
        System.out.println("Сумма чисел массива сооставляет "+sum);
    }
}

