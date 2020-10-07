package com.cie;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);

        System.out.print("Enter any integer: ");
        int number = enter.nextInt();

        System.out.printf("is the number even? ", IsEven(number));
    }
    public static int IsEven(int number){
        if (number % 2 == 0)
            System.out.println("Yes, number is even.");
        else
            System.out.println("No, number is odd.");
        return number;

    }

    }
