package week3projec2;

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        do {
            sum += n;
            n = input.nextInt();
        } while (n != 0);

        System.out.println(sum);


    }
}
