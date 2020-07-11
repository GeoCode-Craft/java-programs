package com.brianpondi;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel>=0 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
            this.pagesPrinted =0;
        }
        this.duplexPrinter = duplexPrinter;
    }



    public int addToner(int tonerAmount) {
        if (tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel + tonerAmount>100){
                return -1;
            }
            return this.tonerLevel += tonerAmount;
        }else{
            return -1;
        }

    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplexPrinter){
            pagesToPrint = (pages/2) + (pages%2);
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted +=pagesToPrint;
        return pagesToPrint;
    }

    //Getters
    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
