package day2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        a += 1;
        for (int i = a;i < b;i += 1) {
            if ((i % 5 == 0) && (i % 10 != 0)) {
                System.out.println(i);
            }
        }

    }
}
