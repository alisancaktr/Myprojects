package week7projec6;

import java.util.Scanner;

public class Q8 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String array[] = text.split(" ");
        System.out.println(numberOfWord(text, array));
    }

    public static int numberOfWord(String a, String array1[]) {


        return array1.length;
    }
}
