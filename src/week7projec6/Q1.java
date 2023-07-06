package week7projec6;

import java.util.Scanner;

public class Q1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        String text2 = "";
        System.out.println(getReverse(text,text2));

    }


    public static String getReverse(String a,String b) {

        for (int i = a.length()-1; i >=0; i--) {
            b = b + a.charAt(i);
        }
        return b;
    }
}
