package week6projec5;

import java.util.Scanner;

public class Q12 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>99 && arr[i]<1000){
                System.out.println(arr[i]);
            }
        }

    }
}
