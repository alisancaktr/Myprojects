package Week2projec1;

import java.util.Scanner;

public class Q4 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        float Weight = input.nextFloat();
        float Height = input.nextFloat();
        System.out.println("Your Body Mass Index is " + (Weight / (Height * Height)));

        if ((Weight / (Height * Height)) < 18.5) {
            System.out.println("You are in the underweight range of BMI scale.");
        } else if ((Weight / (Height * Height)) >= 18.5 && (Weight / (Height * Height)) <= 24.9) {
            System.out.println("You are in the healthy range of BMI scale.");
        } else if ((Weight / (Height * Height)) >= 25.0 && (Weight / (Height * Height)) <= 30.0) {
            System.out.println("You are in the overweight range of BMI scale.");
        } else if ((Weight / (Height * Height)) >= 30.0) {
            System.out.println("You are in the obese range of BMI scale.");
        }
    }
}
