package week7projec6;

import java.util.Scanner;

public class Q7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int arr2[][] = new int[n][m];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = in.nextInt();
            }
        }

        System.out.println(getDifference(arr2));
    }

    public static int getDifference(int arr[][]) {
        int max = arr[0][0];
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        return max - min;
    }
}
