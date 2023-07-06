package week7projec6;

import java.util.Arrays;


public class Q6 {
    public static void main(String args[]) {

        int arr1[] = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * ((200-0) + 1));

        }

        System.out.println((blaBla(arr1)));
    }

    public static int blaBla(int arr[]) {
int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }

        return max;
    }
}
