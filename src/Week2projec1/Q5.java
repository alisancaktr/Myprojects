package Week2projec1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String defaultUn = "alisancaktar";
        String defaultPs = "123456";

        System.out.print("Enter your username: ");
        String username = input.nextLine();


        if (!defaultUn.equals(username)) {
            System.out.println("Wrong username...");
        } else {
            System.out.print("Enter your password: ");
            String password = input.nextLine();

            if (!defaultPs.equals(password)) {
                System.out.println("Wrong password...");
            } else
                System.out.println("You logged in successfully...");


        }
    }
}