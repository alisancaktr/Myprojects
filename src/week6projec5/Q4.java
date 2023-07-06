package week6projec5;

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String any = in.next();
        char arr[] = any.toCharArray();
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

