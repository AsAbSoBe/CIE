package com.cie;

import java.util.Scanner;

public class Exercise2_33 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds:");
        int weight = input.nextInt();


        System.out.println("Enter your height in inches:");
        int height = input.nextInt();

        int  BMI = (weight * 703) / (height * height);
        System.out.printf("Your body mass index is %d%n%n", BMI);

        System.out.println("BMI VALUES");
        System.out.println("Underweight: \tless than 18.5");
        System.out.println("Normal:      \tbetween 18.5 and 24.5");
        System.out.println("Overweight:  \tbetween 25 and 29.9");
        System.out.println("Obese:       \t30 or greater");



    }
}
