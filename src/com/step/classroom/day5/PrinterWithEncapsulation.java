package com.step.classroom.day5;

public class PrinterWithEncapsulation {
    private int tonerLevel;
    private boolean isDuplex;
    private int numberOfPagesPrinted;

    public PrinterWithEncapsulation(boolean isDuplex) {
        this.tonerLevel = 100;
        this.isDuplex = isDuplex;
        this.numberOfPagesPrinted = 0;
    }

    public boolean needRefilling() {
        return this.tonerLevel < 5;
    }


    public void refill() {
        this.tonerLevel = 100;
    }

    public void print(int numberOfPages) {
        this.tonerLevel -= numberOfPages;
        if (isDuplex) {
            double numberOfPagesNeeded = Math.ceil(numberOfPages / 2.0);
            this.numberOfPagesPrinted += numberOfPagesNeeded;
            return;
        }
        this.numberOfPagesPrinted += numberOfPages;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
