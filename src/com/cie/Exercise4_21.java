package com.cie;

import java.util.Scanner;

public class Exercise4_21 {
    public static void main(String[] args) {
        int counter = 1;
        int largest = 0;


            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int number = input.nextInt();

        while (counter < 10){
            System.out.println("Enter the number: ");
            number = input.nextInt();

            if (number > largest){
                largest = number;

            }
            counter++;

        }
        System.out.println("The largest number is: "+ largest);



    }
}
