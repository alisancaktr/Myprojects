package week6projec5;

import java.util.Scanner;

public class Q14 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        char text2 = text.charAt(text.length() - 1);
        char text3 = text.charAt(text.length() - 2);

        if (text2 == text3) {
            System.out.println("THEY ARE EQUAL");
        } else {
            System.out.println("THEY ARE NOT EQUAL");
        }


    }
}
