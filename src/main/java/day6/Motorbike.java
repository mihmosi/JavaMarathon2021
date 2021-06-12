package day6;

class Motorbike {
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

    void info() {
        System.out.println("Это мотоцикл");
    }
}
