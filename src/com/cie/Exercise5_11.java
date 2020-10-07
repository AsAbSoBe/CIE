package com.cie;

import java.util.Scanner;

public class Exercise5_11 {
    public static void main(String[] args) {
        int smallestNumber = 0;
        int number;
        int firstNumber;
        int k = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        firstNumber = input.nextInt();

        for (k = 1; k <= firstNumber; k++) {
            System.out.print("Please, enter numbers: ");
            number = input.nextInt();

            if (number > 0 && k == 1)
                smallestNumber = number;
            if (number < smallestNumber)
                smallestNumber = number;
        }

        System.out.println("The smallest number is " + smallestNumber);




    }
}
