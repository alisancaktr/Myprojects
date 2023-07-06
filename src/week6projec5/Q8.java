package week6projec5;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int[] y={1, 1, 3, 8, 3, 5, 6, 5, 8, 7};
        Arrays.sort(y);

        //After sorting the array, this loop checks the number and the number next to it are equal.
        // If yes, it replaces it with 0.
        for (int i = 0; i < y.length-1 ; i++) {
            if (y[i] == y[i+1]) y[i+1] = 0;

        }

        System.out.println(Arrays.toString(y));
    }
}
