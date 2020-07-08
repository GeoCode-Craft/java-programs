package com.brianpondi;

public class Main {
    public static void main(String[] args) {
        Account faithAccount = new Account();
        faithAccount.setBalance(2_000.00);
        System.out.println(faithAccount.getBalance());
        faithAccount.withdraw(1_500.00);
        faithAccount.deposit(250.00);

        //Constructor with parameters

        Account brianAccount = new Account("XD4566",3_000, "Brian Pondi",
                "brian.letscode@gmail.com","710318300");
        brianAccount.withdraw(1_000);
    }
}
