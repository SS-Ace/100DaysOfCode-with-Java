import java.util.Scanner;

public class minandmaxchallenge {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int small = Integer.MAX_VALUE;
        int larg = 0;
        int count = 0;


        while(true){

            System.out.println("Enter number: ");
            boolean isInt = sc.hasNextInt();

            if(isInt) {
                int n = sc.nextInt();

                if (larg < n) {
                    larg = n;

                }
                if (small > n) {

                    small = n;
                }


            }

            else{
                System.out.println("small: " + small + " ,larg: " + larg);
                break;
            }


        }

        sc.close();
    }
}
