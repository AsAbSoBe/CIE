package com.cie;

public class Exercise3_13 {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Exercise3_13(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0)
        this.monthlySalary = monthlySalary;
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

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public double yearlySalary(){
        return monthlySalary * 12 +(monthlySalary / 10);

    }

    public static void main(String[] args) {
        Exercise3_13 firstEmployee = new Exercise3_13("Akudo", "Okpe", 56.00);
        Exercise3_13 secondEmployee = new Exercise3_13("Chibundu", "Omoji", 76.90);
        Exercise3_13 thirdEmployee = new Exercise3_13("Vincent", "Chukwumba", -90.56);

        System.out.printf("%nFirst Employee%nFirst Name: %s%nLast Name: %s%nMonthly Salary: $%.2f%nYearly Salary with 10% raise: $%.2f%n", firstEmployee.getFirstName(), firstEmployee.getLastName(), firstEmployee.getMonthlySalary(), firstEmployee.yearlySalary());
        System.out.printf("%nSecond Employee%nFirst Name: %s%nLast Name: %s%nMonthly Salary: $%.2f%nYearly Salary with 10% raise: $%.2f%n", secondEmployee.getFirstName(), secondEmployee.getLastName(), secondEmployee.getMonthlySalary(), secondEmployee.yearlySalary());
        System.out.printf("%nThird Employee%nFirst Name: %s%nLast Name: %s%nMonthly Salary: $%.2f%nYearly Salary with 10% raise: $%.2f%n", thirdEmployee.getFirstName(), thirdEmployee.getLastName(), thirdEmployee.getMonthlySalary(), thirdEmployee.yearlySalary());

    }
}
