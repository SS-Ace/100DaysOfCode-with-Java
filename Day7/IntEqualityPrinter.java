public class IntEqualityPrinter {

    public static void printEqual(int a, int b, int c){

        if(a>=0 && b>=0 && c>=0){

            if(a==b && b==c){

                System.out.println("All numbers are equal");
            }



            else if(a!=b && b!=c && a!=c){

                System.out.println("All numbers are different");
            }

            else {
                System.out.println("Neither all are equal or different");

            }
        }

        else{

            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args){

        printEqual(1,1,3);
        printEqual(1, -1, 2);
        printEqual(1, 1, 1);

    }

}