package com.cie;

import org.w3c.dom.ls.LSOutput;

public class Exercise3_14 {
    private int month;
    private int day;
    private int year;

    public Exercise3_14(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void displayDate(int day, int month, int year){
        System.out.println("The current date is "+ getDay() + "/" + getMonth() + "/" + getYear());
    }

    public static void main(String[] args) {
        Exercise3_14 Date = new Exercise3_14(8, 29, 20);

        Date.displayDate(24, 8, 2020);

    }
}
