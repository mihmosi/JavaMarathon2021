package interfaces;

public class Person implements Info{
    String name;

    public Person(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello!");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is "+this.name);
    }
}
