package day0;

public class Lesson23 {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello");
//        System.out.println(sb.toString());
//        sb.append(" my").append(" friend");
//        System.out.println(sb.toString());
        Human1 h1 = new Human1("Bob", 45);

        System.out.println(h1.toString());

    }
}

class Human1 {
    /** пременные объекта */
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+", "+age;
    }
}
