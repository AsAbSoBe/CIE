package com.cie;

import java.util.Scanner;

public class Exercise2_16 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any two integers separated by spaces: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

    }
    public static int larger(int num1, int num2){
        int largerNumber = num1;

        if (num2 > largerNumber) {
            largerNumber = num2;
            System.out.printf("%d%n is the larger number.", num2);
        }
        else
          if (num1 == num2)
              System.out.printf("%d%n and %d%n are both equal", num1, num2);
          else
              System.out.printf("%d%n is the larger number.", num1);
          return largerNumber;

    }
}
