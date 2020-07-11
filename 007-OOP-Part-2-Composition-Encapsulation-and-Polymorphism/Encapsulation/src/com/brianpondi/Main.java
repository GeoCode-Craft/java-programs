package com.brianpondi;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count is " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted
                + " ,new total print count for printer is " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(9);
        System.out.println("Pages printed was " + pagesPrinted
                + " ,new total print count for printer is " + printer.getPagesPrinted());
    }
}
