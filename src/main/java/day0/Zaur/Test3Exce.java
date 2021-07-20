package day0.Zaur;

import java.io.*;

public class Test3Exce {
    public static void main(String[] args) throws Exception {
        File f = new File("test1.txt"); //abstract representation address file
        FileInputStream fis = new FileInputStream(f);
        System.out.println("file naiden");
        fis.read();
//        FileOutputStream fos = new FileOutputStream(f);
//        fos.write(100);
    }
}
