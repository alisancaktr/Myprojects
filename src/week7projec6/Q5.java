package week7projec6;

import java.util.Arrays;


public class Q5 {
    public static void main(String args[]) {

        int arr1[] = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * ((1000 - 100) + 1) + 100);

        }

        System.out.println(Arrays.toString(blaBla(arr1)));
    }

    public static int[] blaBla(int arr[]) {


        return arr;
    }
}
