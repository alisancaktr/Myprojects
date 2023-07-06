package week6projec5;
import java.util.Scanner;
public class Q5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String x = in.next();
        char arr[] = x.toCharArray();
int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum = sum + arr[i]-48;
        }
        System.out.println(sum);
    }
}
