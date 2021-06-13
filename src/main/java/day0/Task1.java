package day0;


public class Task1 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob", 51);
        Human h2 = new Human("Tom", 46);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human h3 = new Human("Tom", 46);
        h1.printNumberOfPeople();
    }
}
class Human {
    /** пременные объекта */
    private String name;
    private int age;
    private static int countPeople;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }

    public void printNumberOfPeople(){
        System.out.println("Number of people is "+countPeople);
    }
}