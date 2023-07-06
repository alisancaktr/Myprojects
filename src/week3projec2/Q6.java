package week3projec2;

import java.util.Scanner;

public class Q6 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[6];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6 || arr[i] > 10) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);

    }
}