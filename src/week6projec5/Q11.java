package week6projec5;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String arr1[] = new String[x];

        for (int i = 0; i < arr1.length ; i++) {
            arr1[i]= in.next();
        }
        String arr2[] = new String[x];

        for (int i = arr2.length-1; i>=0 ; i--) {
            arr2[arr2.length-1-i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
