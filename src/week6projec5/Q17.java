package week6projec5;

import java.util.Scanner;

public class Q17 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String number = in.next();
        String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int x = number.charAt(number.length() - 3);
        for (int i = 0; i < arr.length; i++) {
            if( x==i+48){
                System.out.println(arr[i]);
                break;
            }
        }

    }
}
