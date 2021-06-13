package day5;
/** Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
 * Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
 * Вывести в консоль значение каждого из полей, используя get методы.
 */

public class Task2 {
    public static void main(String[] args) {
        Motorbike moto1 = new Motorbike(2020,"red", "Ural");
        System.out.println("I would have "+moto1.getModel()+"\n"+" motorbike "+moto1.getColor()+"\n"+" color "+moto1.getYear()+" year");
    }
}
