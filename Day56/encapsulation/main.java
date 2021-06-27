package encapsulation;

public class main {

    public static void main(String[] args){
        Printer p1 = new Printer(50, false);
       System.out.println("Initial page count: "+p1.getNumberOfPagesPrinted());
       int pages_printed = p1.printPages(4);
       System.out.println("Pages to print: "+pages_printed+" Total number of pages printed: "+ p1.getNumberOfPagesPrinted());
       pages_printed = p1.printPages(2);
        System.out.println("Pages to print: "+pages_printed+" Total number of pages printed: "+ p1.getNumberOfPagesPrinted());
        System.out.println(p1.addToner(51));

    }
}
