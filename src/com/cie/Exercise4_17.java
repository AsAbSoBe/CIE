package com.cie;

import java.util.Scanner;

public class Exercise4_17 {
    double totalMiles;
    double totalGallons;

    public double getTripMPG(int miles, int gallons){
        totalMiles += miles;
        totalGallons += gallons;

        return miles / (double)gallons;
    }

    public double getTotalMiles() {
        return totalMiles;
    }

    public double getTotalGallons() {
        return totalGallons;
    }
    public double getTotalMPG(){
        return totalMiles / totalGallons;
    }

    public static void main(String[] args) {
        int miles;
        int gallons;
        char cont = 'y';

        Scanner input = new Scanner(System.in);
        Exercise4_17 mileage = new Exercise4_17();

        while (cont != 'n'){
            System.out.println("\n***************************\n");
            System.out.print("Enter Gas Mileage for this trip: ");
            miles = input.nextInt();
            System.out.print("Enter Gallons used for this trip: ");
            gallons = input.nextInt();

            System.out.printf("Your MPG for this trip is: %.2f\n", mileage.getTripMPG(miles, gallons));

            System.out.print("Add another trip? (y/n): ");
            cont = input.next().charAt(0);
        }
        System.out.println("\n*********************\n");
        System.out.println("COMBINED TOTAL MPG");
        System.out.printf("Combined mileage: %.2f\nCombined gallon usage: %.2f",mileage.getTotalMiles(), mileage.getTotalGallons());
        System.out.printf("Your combined MPG for all trip is: %.2f\n", mileage.getTotalMPG());

    }
}





