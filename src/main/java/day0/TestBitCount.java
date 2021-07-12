package day0;

import java.math.BigInteger;

public class TestBitCount {
    public static void main(String[] args) {

        String str1 = new String("Privet");
        System.out.println(str1);

        String str2 = str1.substring(0, 3);
        System.out.println(str2);

        String str3 = str1.replace("ive", "ynarg;lkjdkl;soiu");
        System.out.println(str3);

        System.out.println("A" + 12 +
                "\n" +
                'A' + '1' + "2" +
                "\n" +
                'A' + "12" +
                "\n" +
                "A" + ('\t' + '\u0003'));
        System.out.println(isPalindrome("Madam, I'm Adam!"));
        System.out.println();
        System.out.println(factorial(3));

    }

    public static boolean isPalindrome(String text) {
        String newText = text.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb_newText = new StringBuilder(newText);
        return newText.equalsIgnoreCase(sb_newText.reverse().toString());
    }

    public static BigInteger factorial(int num) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= num; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;

    }
}
