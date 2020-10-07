package com.cie;

public class Exercise3_11 {
   private String partNumber;
   private String partDescription;
   private int quantity;
   private double pricePerItem;

    public Exercise3_11(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        if (quantity > 0)
        this.quantity = quantity;
        else
            this.quantity = 0;

        if (pricePerItem > 0)
        this.pricePerItem = pricePerItem;
        else
            this.pricePerItem = 0;
    }

        public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    public double getInvoiceAmount(){
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {

            Exercise3_11 macbook = new Exercise3_11("123", "A Macbook Laptop", 15, 76.8);
            Exercise3_11 hp = new Exercise3_11("156", "A hp Laptop", 5, 97.8);
            Exercise3_11 lenovo = new Exercise3_11("263", "A Lenovo Laptop", 55, 67.8);

            invoice(macbook.getPartNumber(),macbook.getPartDescription(), macbook.getQuantity(), macbook.getPricePerItem(), macbook.getInvoiceAmount());

        }
        private static void invoice(String number, String description, int quantity, double price, double total){
            System.out.printf("%s: %s - %d * %.2f = %.2f\n", number, description, quantity, price, total);
        }

    }



