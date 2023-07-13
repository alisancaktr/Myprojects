package Chill;

/*
Perfect Number: If the sum of the divisors of a number is equal to that number, then this is a perfect number
Example: 6 --> Divisors: 1,2,3  --->  6 = 1+2+3 --> 6 is a perfect number
 */

public class Main {
    public static void main(String[] args) {

        // 6  - 1,2,3     -- 1 + 2 + 3 = 6

        int num=6;

        int sumOfDivisors = 0;


        for (int i = 1; i <num ; i++) {   // 1,2,3,4,5,
            if (num%i==0) {
                sumOfDivisors += i;
            }

        }

        // Second  Step: I will compare the sumofdivisors with the number

        if (num == sumOfDivisors) {
            System.out.println( num + " is a perfect number");
        } else {
            System.out.println( num + " is not a perfect number");
        }

        System.out.println("---------------------------------------------------------------------");



        String x =  perfectNumber(6);
        System.out.println(x);

        System.out.println(perfectNumber(7));
        perfectNumber(8);




    }



    // Create a method to find whether a number is perfect or not.


    public static String perfectNumber (int num) {
        String result = "";
        int sumOfDivisors = 0;

        for (int i = 1; i <num ; i++) {   // 1,2,3,4,5,
            if (num%i==0) {
                sumOfDivisors += i;
            }

        }

        // Second  Step: I will compare the sumofdivisors with the number

        if (num == sumOfDivisors) {
            result = num + " is perfect";
        } else {
            result = num + " is not perfect";
        }


        return result;

    }


















}