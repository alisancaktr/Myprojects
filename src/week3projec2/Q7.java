package week3projec2;

import java.util.Scanner;

public class Q7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int arr[] = new int[10];

        for (int n = 1; n <= arr.length; n++) {
            for (int i = 1; i <= arr.length; i++) {
                System.out.println(n  + " x " + i + " = " + (n * i));
            }
            System.out.println("******************");
        }

    }
}