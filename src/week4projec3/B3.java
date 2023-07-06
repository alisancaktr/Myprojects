package week4projec3;

import java.util.Arrays;
import java.util.Scanner;

public class B3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int arr1[] = {5, 3, 4, 8, 9, 89};
        int arr2[] = {5, 1, 4, 7, 9, 89};

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }

        }
        int arr3[] = new int[count];
int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[k] = arr1[i];
                    k++;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}