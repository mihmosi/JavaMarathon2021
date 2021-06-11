package day0;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        Person person1 = new Person();
        person1.setName(login);
        person1.setAge(51);
        person1.speak();
        System.out.println("My name is "+person1.getName()+" and I "+person1.getAge()+" years old");
        Person.sayHello();

        Person person2 = new Person();
        person2.setName("Ilona");
        person2.setAge(47);
        person2.speak();
    }
}
class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        name = userName;
    }
    public String getName() {
        return name;
    }
    public void setAge(int userAge) {
        age = userAge;
    }
    public int getAge() {
        return age;
    }

    void speak() {
        System.out.println("Hello, my name is "+name+" and I "+age+" years old!" );
    }
    static void sayHello(){
        System.out.print("Привет! ");
    }
}