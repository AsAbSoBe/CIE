package com.cie;

import java.util.Scanner;

public class Exercise4_19 {
    private static final double basePay = 200.0;
    private static final double commissionPercent = 0.09;

    private double totalItems;

    public void itemInput(int item){
        switch (item){
            case 1:
                totalItems += 239.99;
                break;
            case 2:
                totalItems += 129.75;
                break;
            case 3:
                totalItems += 99.95;
                break;
            case 4:
                totalItems += 350.89;
                break;
            default:
                break;
        }
    }
    public double getSalesTotal(){
        return totalItems;
    }
    public double commissionCalculation(){
        return basePay + totalItems * commissionPercent;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercise4_19 salesCommissionCalculation = new Exercise4_19();

        int itemNo = 0;

        while (itemNo != -1){
            System.out.print("Enter the number(1-4) of the item sold (-1 to exit): ");
            itemNo = input.nextInt();

            salesCommissionCalculation.itemInput(itemNo);
        }

        if (salesCommissionCalculation.getSalesTotal() > 0){
            System.out.print("\n\nWEEKLY COMMISSION\n");
            System.out.printf("Weekly sales total: %.2f\n", salesCommissionCalculation.getSalesTotal());
            System.out.printf("Weekly earnings: %.2f\n", salesCommissionCalculation.commissionCalculation());
        }
    }
}
