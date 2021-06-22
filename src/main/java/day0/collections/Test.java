package day0.collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            list.add(i);
        }
       list.remove(5);
        System.out.println(list);

        list = new LinkedList<>();
    }
}
