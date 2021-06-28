package encapexe;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount > 100){
                return -1;
            }
            return this.tonerLevel += tonerAmount;
        }
        return -1;
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(duplex){
            pagesToPrint = (pagesToPrint / 2) + (pagesToPrint % 2);
        }

        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }


}

