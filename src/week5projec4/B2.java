package week5projec4;

import java.util.Arrays;

public class B2 {
    public static void main(String[] args) {
        String text = "aaaabbbbbbbfffffee";
        char textArray[] = new char[text.length()];


        for (int i = 0; i < text.length(); i++) {
            textArray[i] = text.charAt(i);
        }

        int count=1;
        String print="";

        for (int i = 0; i < textArray.length-1; i++) {
            if (textArray[i] == textArray[i+1]) count++;
            else {
                print=print+count+textArray[i]; count=1;
            }
        }
        print = print+count+textArray[textArray.length-1];
        System.out.println(print);

    }
}


