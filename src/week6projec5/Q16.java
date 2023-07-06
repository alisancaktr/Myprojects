package week6projec5;

import java.util.Scanner;

public class Q16 {
    public static void  main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=(int)(Math.random() * 1001);
        for (int i = 0; i <10 ; i++) {
            int x = in.nextInt();
            if(x<n){
                System.out.println("Think big buddy");
            }else if(x>n){
                System.out.println("Take it easy tiger");
            }else {
                System.out.println("You nailed it");
                break;
            }
        }
        System.out.println("Today is not your lucky day.Try again tomorrow");

    }
}
