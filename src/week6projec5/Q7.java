package week6projec5;

import java.util.Scanner;

public class Q7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String y=String.valueOf(n);
        char arr[] = y.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length; i++) {
            isPalindrome = false;
            if (arr[i] == arr[arr.length - i - 1]) {
                isPalindrome = true;
            }
        }


        System.out.println(isPalindrome);

    }
}

