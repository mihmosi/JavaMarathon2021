package day6;

class Car {
    int year;
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

    void info() {
        System.out.print("Это автомобиль ");
    }
    int yearDifference(int inputYear) {
        if (inputYear > year){
            this.oldest =  inputYear - year;
        } else {
            System.out.println("Введите правильный год");
        }
       return oldest;
    }

}