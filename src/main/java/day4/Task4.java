package day4;
// Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
// Найти максимум среди сумм трех соседних элементов.
//   Для найденной тройки с максимальной суммой выведите
// значение суммы и индекс первого элемента тройки.
import java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[] = new int[100];
        for (int i = 0;i < arr.length;i++){   /** заполнили массив случайными числами */
            arr[i] = rand.nextInt(10001);
        }
        int sum = 0,  max = 0, index = 0;
        for (int i = 0;i < arr.length;i++) {
            sum = 0;
            int count = 0;
            for (int j = i;count<3 && j != 99;j++) {
                sum = sum + arr[j];
                count++;
            }
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        System.out.println("максимальная сумма тройки: "+max+" и ее индекс: "+index);
    }
}
