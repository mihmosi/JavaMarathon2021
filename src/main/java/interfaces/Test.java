package interfaces;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Nik");
        Animal animal = new Animal(2);
        outputInfo(person);
        outputInfo(animal);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
