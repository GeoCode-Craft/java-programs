package com.brianpondi;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private int customerPhoneNumber;

    //Constructor
    public Account(){
        System.out.println("Empty Constructor");
    }
    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   int customerPhoneNumber){
        this.number =number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress =customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
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

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
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
