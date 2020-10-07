package com.cie;

import java.util.Scanner;

public class Exercise2_28 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius:");
        int radius = input.nextInt();

        double pi = 3.14159;
        int diameter = 2 * radius;
       int circumference = 2 * (int)pi *  radius;
       int area = (int) pi * radius * radius;

       System.out.printf("Circle with radius %d has diameter %d, circumference %d and area %d", radius, diameter, circumference, area);



    }
}
