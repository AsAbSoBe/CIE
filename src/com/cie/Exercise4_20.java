package com.cie;

import java.util.Scanner;

public class Exercise4_20 {
    private static double baseHours = 40.0;
    private static double overtimeRate = 1.5;
    private static double undertimeRate = 1.2;
    private double totalHours;
    private double hourlyRate;

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 40){
            System.out.println("You have worked under time. Hence, you'll be under payed ");
        }
        this.hourlyRate = hourlyRate;
    }

    public double grossPay(){
        return totalHours > 40 ? (hourlyRate * baseHours)
                + ((hourlyRate * overtimeRate) * (totalHours - baseHours)) : totalHours * hourlyRate;
    }
    public double GrossPay(){
        return totalHours < 40 ? (hourlyRate * baseHours) + ((hourlyRate * undertimeRate) * (baseHours - totalHours)) : grossPay();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise4_20 salaryCalculator = new Exercise4_20();

        for (int counter = 1; counter < 4; counter ++){
            System.out.printf("Employee %d weekly hours: ", counter);
            salaryCalculator.setTotalHours(input.nextDouble());

            System.out.printf("Employee %d hourly pay: $", counter);
            salaryCalculator.setHourlyRate(input.nextDouble());

            System.out.printf("Employee %d gross pay: $%.2f\n\n\n4", counter, salaryCalculator.grossPay());
        }
    }

}

