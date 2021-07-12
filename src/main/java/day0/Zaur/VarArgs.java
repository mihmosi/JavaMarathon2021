package day0.Zaur;

public class VarArgs {
    public static void main(String[] args) {
        summa("1", 5, 7);

    }
    static void summa(String s, int ... a){
        int summa = 0;
        for (int i = 0;i < a.length;i++){
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }
}
