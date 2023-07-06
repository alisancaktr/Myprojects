package week7projec6;

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String text = in.next().toLowerCase();

        System.out.println(getA(text));
    }





    public static int getA(String a){
        int count =0;

        for (int i = 0; i <a.length() ; i++) {
            if(a.charAt(i)=='a'){
                count++;
            }
        }
        return count;


    }
}
