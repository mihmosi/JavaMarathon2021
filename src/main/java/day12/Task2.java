package day12;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350. Вывести список.
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0;i < 30;i++){
            if(i % 2 == 0)
            nums.add(i);
        }
        for (int i = 300;i < 350;i++) {
            if (i % 2 == 0)
                nums.add(i);
        }
        System.out.println(nums);
    }
}
