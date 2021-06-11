package day0;


public class Task1 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob",50);

    }
}
class Human {
    private String name;
    private int age;

    public Human(){
        this.name = "By default";
        this.age = 0;
        System.out.println("Привет из первого конструктора");
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Привет из второго конструктора");
    }

    public void setName(String name) { this.name = name; }

    public void setAge(int age) { this.age = age; }
}