package day6;

public class Airplane {
    String producer; //(изготовитель)
    int year; //(год выпуска)
    int length; //(длина)
    int weight; //(вес)
    int fuel = 0; //(количество топлива в баке)

    public Airplane(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public void info() {
        System.out.println("Изготовитель: "+this.producer+", год выпуска: "+this.year+", длина: "+this.length+", вес:"+this.weight+", количество топлива в баке:"+this.fuel);
    }
    public int fillUp(int n){
        this.fuel = n;
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public int getFuel() {
        return fuel;
    }

}
