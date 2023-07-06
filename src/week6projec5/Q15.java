package week6projec5;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.print("Please enter your credit card number = ");
        String ccNumber = in.nextLine();

        String lastFourDigit= ccNumber.substring(ccNumber.lastIndexOf(" "));
        String hide=ccNumber.substring(0, ccNumber.lastIndexOf(" ")).replaceAll("[0-9]", "*");
        System.out.println("hide = " + hide + " " + lastFourDigit);
    }
}
