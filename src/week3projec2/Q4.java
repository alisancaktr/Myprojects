package week3projec2;

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int prod = 1;

        for (int i = 1; i <= n; i++) {
            prod = prod * i;
        }
        System.out.println("Multiplication =" + prod);

    }
}
