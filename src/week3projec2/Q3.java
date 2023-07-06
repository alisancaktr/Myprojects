package week3projec2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println();

            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
        System.out.println("Total of even numbers:" + sum);
    }
}