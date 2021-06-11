package day4;

// 1 Заполнить двумерный массив (матрицу) случайными числами от 0 до 50.
// Размер матрицы задать m=12, n=8
// (m - размерность по строкам, n - размерность по колонкам).
// 2 В консоль вывести индекс строки, сумма чисел в которой максимальна.
// 3 Если таких строк несколько, вывести индекс последней из них.
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int m = 3;
        int n = 5;
        int[][] arrMatrix = new int[m][n];    /* обьявляем длину масива */
        /* заполнение массива случайными числами */
        for (int i = 0;i < arrMatrix.length;i++){       /* цикл внешнего массива */
            for (int j = 0;j < arrMatrix[i].length;j++){   /* внутренние массивы */
            arrMatrix[i][j] = rand.nextInt(51);    /* присваиаем случайные числа */
            }
        }
        /* выводим на печать матрицу массива */
        for (int i = 0;i< arrMatrix.length;i++,System.out.println()){  /* строки */
            for (int j = 0;j<arrMatrix[i].length;j++){   /* столбцы */
                System.out.print(arrMatrix[i][j]+" ");
            }
        }
        int index = 0;
        int max = 0;
        for (int i = 0;i< arrMatrix.length;i++){    /* перебираем строки */
            int sum = 0;                               /* обнуляем сумму строки */
            for (int j =0;j < arrMatrix[i].length;j++){    /* перебираем строку */
                sum = sum + arrMatrix[i][j];  /* складываем сумму */
                if (sum>max) {       /* если новая сумма больше */
                    max = sum;   /* присаиваем новый максимум */
                    index = i;    /* и его индекс */
                }
            }
        }
        System.out.println("максимальная сумма: "+max+" у строки с индексомЖ "+ index);
    }
}
