package week5projec4;

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        String text1 = in.nextLine().toUpperCase();
        char arr[] = text1.toCharArray();
        String text2 = "A";
       char arr2[] = text2.toCharArray();
        int count = 0;

        for (int i = 0; i <text1.length() ; i++) {
            for (int j = 0; j <text2.length() ; j++) {
                if(arr[i] == arr2[j]){
                    count++;
                }
            }

        }

        System.out.println("Number of A = " + count);


    }
}
