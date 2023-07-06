package week5projec4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        int arr[][] = new int[x][y];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }

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

        System.out.println(max - min);


    }
}