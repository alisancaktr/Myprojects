package week7projec6;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {


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
        System.out.println(Arrays.deepToString(replace(arr2)));
    }

    public static int[][] replace(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] % 2 == 0) {
                    arr[i][j] = 222;
                }
            }
        }
        return arr;
    }
}