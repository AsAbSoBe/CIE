package com.cie;

public class AccountMod {
    private String name;
    private double balance;

    public AccountMod(String name, double balance) {
        this.name = name;

        if (balance > 0.0)
        this.balance = balance;
    }

    public void withdraw(double withdrawalAmount){
        if (withdrawalAmount > 0.0)
            balance = balance - withdrawalAmount;
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
