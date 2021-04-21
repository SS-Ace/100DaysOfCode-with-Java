public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes >= 0) {
            int megabytes = kiloBytes / 1024;
            int kilobyterem = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = " + megabytes + " MB and " + kilobyterem + " KB");

        }

        else{
            System.out.println("Invalid Value");
        }


    }

    //testing
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(1200);
        printMegaBytesAndKiloBytes(-1);
    }

}