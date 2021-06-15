package day9.Task1;

public class Teacher extends Human{
    private final String subjectName;
    /**get method*/
    public String getSubjectName() {
        return this.subjectName;
    }
    public Teacher(String name, String subjectName){
        super(name);
        this.subjectName = subjectName;
    }
    public void printInfo(){
        super.printInfo();
        System.out.println("Это преподаватель с именем: "+getName());
    }
}
