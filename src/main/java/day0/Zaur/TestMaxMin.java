package day0.Zaur;

public class TestMaxMin {
    public static void maxMin(double[] array1){
        double max = array1[0];
        double min = array1[0];

        for (int i = 1;i < array1.length;i++){
            if (array1[i] > max){
                max = array1[i];
            }
            if (array1[i] < min){
                min = array1[i];
            }
        }
        System.out.println("Минимальный элемент массива "+ min+ " Максимальный элемент массива "+ max);
    }

    public static void main(String[] args) {
        double []arrDub = {0.0, -5.55, 0.5, 55.6, 2.4, 23.6 };
        maxMin(arrDub);
        maxMin(new double[]{0.5, 5.3});

        char arChar[] = new char[]{'p','r','i','v','e','t'};
        String str = new String(arChar);
        System.out.println(str);

        StringBuilder sb = new StringBuilder("hello world");
//        sb.append(arChar, 2, 3);
//        System.out.println(sb);
        sb.insert(1, arChar, 2, 3);
        System.out.println(sb);



    }
}
