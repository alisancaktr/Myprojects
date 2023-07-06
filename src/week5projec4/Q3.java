package week5projec4;

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        int arr[][] = new int[x][y];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = in.nextInt();
                count++;
            }
        }

        int arr2[] = new int[count];

        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr[i].length; j++) {
                prod = prod*arr[i][j];

            }
            arr2[i]=prod;
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
