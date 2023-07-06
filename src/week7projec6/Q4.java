package week7projec6;

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];

        for (int i = 0; i < arr1.length ; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < arr2.length ; i++) {
            arr2[i] = in.nextInt();
        }
        System.out.println(getSum(arr1,arr2));

    }

    public static int getSum(int arr1[], int arr2[]) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr1.length ; i++) {
            sum1 = sum1 + arr1[i];
        }
        for (int i = 0; i < arr2.length ; i++) {
            sum2 = sum2 + arr2[i];
        }

        return sum1 + sum2;
    }
}