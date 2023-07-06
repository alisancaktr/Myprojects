package week4projec3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        boolean isTrue = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[0] == arr[arr.length - 1]) {
                isTrue = true;
            }else
                isTrue = false;
        }
        System.out.println(isTrue);
    }
}