package com.cie;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise3_16 {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public Exercise3_16(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public String getDateOfBirth(){
        return String.format("%d/%d/%d",birthDay, birthMonth, birthYear);
    }

    public int getAge(){
        return java.util.Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }
    public int getMaxHeartRate(){
        return 220 - getAge();

    }
    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f", getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter Date of birth dd mm yyyy: ");
        int[] arrayDOB = new int[3];

        for (int i = 0; i < 3; i++){
            arrayDOB[i] = input.nextInt();
        }
        Exercise3_16 user1 = new Exercise3_16(firstName, lastName, arrayDOB[0], arrayDOB[1], arrayDOB[2]);

        userInfo(user1);


    }

    public static void userInfo(Exercise3_16 user){
        System.out.printf("%s %s\n%s - %d years of age\nMaximum HeartRate: %d\n", user.getFirstName(),
                user.getLastName(), user.getDateOfBirth(), user.getAge(),user.getMaxHeartRate());

        System.out.printf("Target Heart Rate Range: %s\n", user.getTargetHeartRate());
    }
}
