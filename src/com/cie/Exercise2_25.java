package com.cie;

import java.util.Scanner;

public class Exercise2_25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any two numbers separated by spaces:");
        int num1 =input.nextInt();
        int num2 =input.nextInt();

        if (num1 % num2 == 0)
            System.out.printf("%d is a multiple of %d", num2, num1);
        else
            System.out.printf("%d is not a multiple of %d", num2, num1);





    }


}
