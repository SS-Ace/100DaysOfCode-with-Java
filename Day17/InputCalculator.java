import java.util.Scanner;

public class InputCalculator {

   public static void inputThenPrintSumAndAverage() {

       Scanner sc = new Scanner(System.in);


        int sum = 0;
        long average = 0;
        int n = 0;

        while (true) {

            boolean hasInt = sc.hasNextInt();
            if (hasInt) {
                int number = sc.nextInt();
                sc.nextLine();
                n++;
                sum = sum + number;
                average = Math.round((double)sum /(double)n);

            }



            else {

                System.out.println("SUM = "+sum+" AVG = "+average);
                break;

            }

        }
        sc.close();
    }

}