package day6;

public class Car {
    private int year;
    int oldest;
    private String color;
    private String model;

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

    public int getOldest(){ return oldest; }

    public void info() {
        System.out.print("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        if (inputYear > year){
            this.oldest =  inputYear - year;
        } else {
            System.out.println("Введите правильный год");
        }
       return oldest;
    }

}