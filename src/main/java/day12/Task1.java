package day12;

import java.util.ArrayList;
import java.util.List;

/**
 * Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
 * Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка.
 * Вывести список в консоль.
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("Vaz");
        list.add("Gaz");
        list.add("Renault");
        list.add("BMW");
        System.out.println(list);

        list.add(2, "Mersedes");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

    }
}
