package week6projec5;
import java.util.Scanner;
public class Q6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String x = in.next();
        char arr[] = x.toCharArray();
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum = sum + arr[i]-48;
        }

        if(sum<10){
            System.out.println(sum);
        }else {
            int sum1 = 0;
            String y=String.valueOf(sum);
            char arr1[] = y.toCharArray();
            for (int i = 0; i < arr1.length; i++) {
                sum1 = sum1 + arr1[i] - 48;
            }
            if (sum1 < 10) {
                System.out.println(sum1);
            } else {
                int sum2 = 0;
                String z=String.valueOf(sum1);
                char arr2[] = z.toCharArray();
                for (int i = 0; i < arr2.length; i++) {
                    sum2 = sum2 + arr2[i] - 48;
                }
                System.out.println(sum2);
            }

        }
    }
}
