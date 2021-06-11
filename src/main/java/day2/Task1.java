package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        System.out.println("Введите количество: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (0 < n && n < 5) {
            System.out.println("Малоэтажный дом");
        } else if (5 <= n && n <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (n >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }

    }
}
