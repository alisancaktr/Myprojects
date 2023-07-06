package week6projec5;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int arr1[] = new int[x];


        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]=in.nextInt();
        }
        int y = in.nextInt();
        int arr2[] = new int[y];

        for (int i = 0; i < arr2.length ; i++) {
            arr2[i]=in.nextInt();
        }

        int arr3[] = new int[x+y];

        for (int i = 0; i < arr1.length ; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i < arr2.length ; i++) {
            arr3[arr1.length+i]=arr2[i];

        }


        System.out.println(Arrays.toString(arr3));



    }
}
