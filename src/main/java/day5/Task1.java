package day5;
/** Создать класс Автомобиль (англ. Car) с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать get и set методы для каждого поля.
 * Создать экземпляр класса Автомобиль.
 * Задать значение для каждого поля, используя set методы.
 * Вывести в консоль значение каждого из полей, используя get методы.
 Созданный вами класс должен отвечать принципам инкапсуляции.
 */
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("grey");
        car.setModel("Mazda");
        car.setYear(2005);
        System.out.println("I used "+car.getModel()+" color of "+ car.getColor()+" year "+ car.getYear()+" old");

    }
}
class Car {
    int year;
    String color;
    String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}