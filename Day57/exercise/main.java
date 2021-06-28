package encapexe;
public class main {

public static void main(String[] args){
        Printer p1 = new Printer(50, true);
        System.out.println(p1.addToner(50));
        System.out.println("Initial page count: "+p1.getPagesPrinted());
        int pages_printed = p1.printPages(4);
        System.out.println("Pages printed: "+pages_printed+" Total number of pages printed: "+ p1.getPagesPrinted());
        pages_printed = p1.printPages(2);
        System.out.println("Pages printed: "+pages_printed+" Total number of pages printed: "+ p1.getPagesPrinted());
        System.out.println(p1.addToner(51));

        }
        }
