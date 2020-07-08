package com.brianpondi;

public class Main {
    public static void main(String[] args) {
        Car porshe = new Car();
        Car audi = new Car();

        System.out.println("Model is " + porshe.getModel());
        porshe.setModel("Cayan");
        System.out.println("Model is " + porshe.getModel());



    }
}
