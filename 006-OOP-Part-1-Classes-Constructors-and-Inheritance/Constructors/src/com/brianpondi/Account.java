package com.brianpondi;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //Constructor 1
    public Account(){
        System.out.println("Empty Constructor");
    }
    //Constructor 2
    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   String customerPhoneNumber){
        this.number =number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress =customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    //Constructor 3
    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this( "DG789",0.00,customerName,customerEmailAddress,customerPhoneNumber);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println(" You have deposited " + depositAmount + " New Balance is " + this.balance);
    }

    public void withdraw(double withdrawalAmount ){
        if (this.balance - withdrawalAmount <0)
            System.out.println("Insufficient funds");
        else
            this.balance -= withdrawalAmount ;
        System.out.println(" You have withdrawn " + withdrawalAmount + " New Balance is " + this.balance);
    }
}
