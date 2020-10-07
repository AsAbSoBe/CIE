package com.cie;

import java.util.Scanner;

public class Exercise2_17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers separated by spaces: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int sum = num1 + num2 + num3;
        int average = sum / 3;
        int product = num1 * num2 * num3;
        System.out.printf("The sum,average and product of the integers are:%d, %d and %d", sum, average, product);
        System.out.printf("%nThe largest number is: %d ", largest(num1, num2,num3));
        System.out.printf("%nThe smallest number is: %d", smallest(num1, num2,num3));
    }
    public static int smallest (int num1, int num2, int num3){
        int smallestNumber = num1;

        if (num2 < smallestNumber )
            smallestNumber = num2;
        if (num3 < smallestNumber )
            smallestNumber = num3;

        return smallestNumber;
    }
    public static int largest(int num1, int num2, int num3){

        int largestNumber = num1;

        if (num2 > largestNumber)
            largestNumber = num2;
        if (num3 > largestNumber)
            largestNumber = num3;

        return largestNumber;
    }

}
