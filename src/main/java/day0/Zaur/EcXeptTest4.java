package day0.Zaur;

import java.io.*;

public class EcXeptTest4 {
    void abc() throws FileNotFoundException {
        File f = new File("test1.txt");
//        try {
        FileInputStream fis = new FileInputStream(f);
//            fis.read();
        System.out.println(" Vsem horoshego dnya");
//        }
//        catch (FileNotFoundException e) {
//            System.out.println(" Bil poiman exception : " + e);
//        }
    }

    void def() throws FileNotFoundException {
        System.out.println("privet");
//        try {
        abc();
//        } catch (FileNotFoundException e) {
//            System.out.println(" Bil poiman exception : " + e);
//        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        EcXeptTest4 t = new EcXeptTest4();
        t.def();

    }

}

