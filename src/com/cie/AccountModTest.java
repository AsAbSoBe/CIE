package com.cie;

import java.util.Scanner;

public class AccountModTest {
    public static void main(String[] args){
        AccountMod account1 = new AccountMod("Max Lauren", 50.00);
        AccountMod account2 = new AccountMod("Jessica Lauren", 67.00);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter withdrawal amount for account1: ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%nsubtracting %.2f from account1 balance%n%n", withdrawalAmount);
        account1.withdraw(withdrawalAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());


        System.out.print("Enter withdrawal amount for account2: ");
        withdrawalAmount = input.nextDouble();
        System.out.printf("%nsubtracting %.2f from account2 balance%n%n", withdrawalAmount);
        account2.withdraw(withdrawalAmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
    }
}
