package day4;
//Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
//        Затем, используя цикл for each вывести в консоль:
//        наибольший элемент массива
//        наименьший элемент массива
//        количество элементов массива, оканчивающихся на 0
//        сумму элементов массива, оканчивающихся на 0
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] arr = new int[100];
        for (int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(10001);
        }
        int max = 0;
        int min = arr[0];
        int count = 0;
        int sum = 0;
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
            if (item < min) {
                min = item;
            }

            if (item % 10 == 0) {
                  count++;
            }

            if (item % 10 == 0) {
                sum += item;
            }
        }
        System.out.println("наибольший элемент массива: "+max);
        System.out.println("наименьший элемент массива: "+min);
        System.out.println("количество элементов массива, оканчивающихся на 0: "+count);
        System.out.println("сумму элементов массива, оканчивающихся на 0: "+sum);
   }
}
