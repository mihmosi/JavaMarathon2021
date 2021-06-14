package day8;
/** Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это
 * одна строка, полученная конкатенацией (“склеиванием”) чисел из диапазона
 * через пробел (0 + “ “ + 1 + “ “ + 2 + … + 20000).
 После создания такой строки, вызов System.out.println() на этой строке
 должен вывести в консоль сразу все числа из диапазона:
 0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000

 Для того, чтобы почувствовать разницу в производительности между конкатенацией
 обычных строк (класс String) и использовании StringBuilder, реализуйте описанную
 задачу этими двумя способами, замеряя время работы программы.*/
public class Task1 {
    public static void main(String[] args) {
        String string = "";
        for(int i = 0;i <= 20000;i++) {
            string += " " + i;
        }
            long startTime = System.currentTimeMillis();
        System.out.println(string);
            long endTime = System.currentTimeMillis();


            System.out.println("Total execution time: " + (endTime-startTime) + "ms");



        StringBuilder stringBuilder = new StringBuilder();
        for(int j = 0;j <= 20000;j++) {
            stringBuilder.append(j).append(" ");
        }
        long startTime1 = System.currentTimeMillis();
        System.out.println(stringBuilder.toString());
        long endTime1 = System.currentTimeMillis();

        System.out.println("Total execution time: " + (endTime1-startTime1) + "ms");

        int strTime = getStrTime(startTime, endTime);
        int strbTime = getStrTime(startTime1, endTime1);
        System.out.printf("Difference is %d ms",(strTime - strbTime));
    }

    private static int getStrTime(long startTime, long endTime) {
        return (int) (endTime - startTime);
    }
}

