package week4projec3;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double arr[] = new double[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = sum / arr.length;
        System.out.println(average);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                System.out.print(arr[i] + " ");
            }
        }


    }
}