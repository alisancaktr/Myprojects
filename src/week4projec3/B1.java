package week4projec3;

import java.util.Scanner;

public class B1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int arr[] = {1, 3123, 5, -3, 13, 101, 50, -131, 6, 191, 311, -500, 6, 19, -3, -5};
        int min = arr[0];
        int min2 = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min2 && arr[i] != min) {
                min2 = arr[i];
            }

        }
        System.out.println(min2);
    }
}