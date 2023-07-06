package Week2projec1;

import java.util.Scanner;

public class Q7 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 0;
        while (i <= n) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }

    }

}
