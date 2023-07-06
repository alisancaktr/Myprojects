package week6projec5;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        int [] arrayAscending = {1, 5, -2, 8, 5, 74};

        int temp=0;

        for (int i = 0; i < arrayAscending.length; i++) {
            for (int j = i + 1; j < arrayAscending.length; j++) {
                if (arrayAscending[i] > arrayAscending[j]) {
                    temp = arrayAscending[i];
                    arrayAscending[i] = arrayAscending[j];
                    arrayAscending[j] = temp;
                }
            }
        }

        System.out.println("Ascending: " + Arrays.toString(arrayAscending));

        int [] arrayDescending = {1, 5, -2, 8, 5, 74};

        temp=0;
        for (int i = 0; i < arrayDescending.length; i++) {
            for (int j = i+1; j < arrayDescending.length; j++) {
                if (arrayDescending[i] < arrayDescending[j]) {
                    temp=arrayDescending[i];
                    arrayDescending[i]=arrayDescending[j];
                    arrayDescending[j]=temp;
                }
            }
        }
        System.out.println("Descending: " + Arrays.toString(arrayDescending));


    }
}
