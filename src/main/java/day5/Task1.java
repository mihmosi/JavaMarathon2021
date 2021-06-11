package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Mazda");
        car.setColor("grey");
        car.setYear(2005);
        System.out.println("I used "+ car.getModel()+" of color "+car.getColor()+" of "+car.getYear()+" year");

    }
}
class Car{
    int year;

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

    String color;
    String model;
}
