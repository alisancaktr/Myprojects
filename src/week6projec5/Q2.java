package week6projec5;

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String text = in.next();
char arr[] = text.toCharArray();
        boolean evenOrOdd = false;
        if(arr.length%2==0){
            evenOrOdd=true;
            System.out.println(evenOrOdd);
        }else{
            System.out.println(evenOrOdd);
        }


    }
}
