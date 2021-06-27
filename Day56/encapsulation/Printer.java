package encapsulation;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }

        else {
            this.tonerLevel = -1;
        }
        this.numberOfPagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount > 0 && tonerAmount <= 100) {
           if(this.tonerLevel + tonerAmount > 100){
               return -1;
           }
           this.tonerLevel += tonerAmount;
           return this.tonerLevel;
        }

        else{
            return -1;
        }
    }



    public int printPages(int pages) {
        int pagestoPrint = pages;
        if (this.duplexPrinter) {
            pagestoPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagesPrinted += pagestoPrint;
        return pagestoPrint;
    }

    public int getNumberOfPagesPrinted(){
        return numberOfPagesPrinted;
    }
}
