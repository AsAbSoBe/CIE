package com.cie;

import javax.swing.*;
import java.util.Scanner;

public class Exercise4_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any 5 digits: ");
        int number = input.nextInt();

        if (number < 5) {
            System.out.println("Digits must be 5 in number.\nPlease enter another 5 digits: ");
        }
            int temporaryNumber = number;
            int reverseNumber = 0;

            while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number / 10;
        }
        if (temporaryNumber == reverseNumber) {
            System.out.println(temporaryNumber + " is a palindrome!");
        }

        else
            System.out.println(temporaryNumber + " is not a palindrome");
    }
}