package week4projec3;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int arr[] = new int[100];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        int max = arr[0];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;

            }

        }
        System.out.print(max + " " + index);

    }
}
