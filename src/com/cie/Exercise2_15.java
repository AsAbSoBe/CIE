package com.cie;

import java.util.Scanner;

public class Exercise2_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers separated by spaces: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.printf("The sum of the two integers is %d%n ", sum(num1, num2));
        System.out.printf("The product of the two integers is %d%n ", product(num1, num2));
        System.out.printf("The difference of the two integers is %d%n ", difference(num1, num2));
        System.out.printf("The quotient of the two integers is %d%n ", quotient(num1, num2));


    }
    public static int sum(int num1, int num2){
        int add = num1 + num2;
        return add;

    }
    public static int product(int num1, int num2){
        int multiplication = num1 * num2;
        return multiplication;

    }
    public static int difference(int num1, int num2){
        int sub = num1 - num2;
        return sub;


    }
    public static int quotient(int num1, int num2){
        int div = num1 / num2;
        return div;

    }
}
