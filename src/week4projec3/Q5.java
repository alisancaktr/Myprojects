package week4projec3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + (int) Math.pow(arr[i], 3);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) { // sondaki + yı kaldırmak için uyguladık.
                System.out.print(arr[i] + "\u00B3 + ");
            }else {
                System.out.print(arr[i] + "\u00B3");
            }
        }
        System.out.print(" = " + sum);
    }
}