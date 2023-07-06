package week5projec4;

import java.util.Arrays;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String sentence=sc.nextLine();
        String sentenceArray[] = sentence.split(" ");

        //In this loop, we are removing the repeated character
        for (int i = 0; i < sentenceArray.length -1; i++) {
            if (sentenceArray[i].charAt(sentenceArray[i].length()-1) == sentenceArray[i+1].charAt(0)) {
                sentenceArray[i+1] = sentenceArray[i+1].substring(1);
            }
        }

        //In this loop we are creating our new String in which the repeated characters are being removed
        String combined = "";
        for (int i = 0; i < sentenceArray.length; i++) {
            combined = combined + sentenceArray[i];
        }

        System.out.println(combined);
    }

}
