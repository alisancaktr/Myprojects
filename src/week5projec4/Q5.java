package week5projec4;

public class Q5 {
    public static void main(String args[]) {

        String text = "What a perfect day to code with JAVA";
        String[] arr = text.split(" ");

        for (int i = 0; i < 2; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
