package com.cie;

import java.util.Scanner;

public class MinimumValue {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter four floating point values" +
                " separated by spaces: ");
        double number1 = enter.nextDouble();
        double number2 = enter.nextDouble();
        double number3 = enter.nextDouble();
        double number4 = enter.nextDouble();

        double result = minimum(number1, number2, number3, number4);
        System.out.println("Minimum value is: " + result);


    }
    public static double minimum(double x, double y, double z, double j){
        double minimumNumber = x;

        if (y < minimumNumber )
            minimumNumber = y;
        if (z < minimumNumber)
            minimumNumber = z;
        if (j < minimumNumber)
            minimumNumber = j;

        return minimumNumber;
    }


}
