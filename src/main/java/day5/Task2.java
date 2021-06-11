package day5;
/** Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать экземпляр класса Мотоцикл, используя конструктор (set методы не использовать).
 * Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
 * Вывести в консоль значение каждого из полей, используя get методы.
 */

public class Task2 {
    public static void main(String[] args) {
        Motorbike moto1 = new Motorbike(2020,"red", "Ural");
        System.out.println("I would have "+moto1.getModel()+" motorbike "+moto1.getColor()+" color "+moto1.getYear()+" year");
    }
}
class Motorbike{
    int year;
    String color;
    String model;

    public Motorbike(int year, String color, String model ){
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() { return year; }

    public String getColor() { return color; }

    public String getModel() { return model; }
}
