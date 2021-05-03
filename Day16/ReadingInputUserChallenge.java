import java.util.Scanner;

public class ReadingInputUserChallenge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;
        int sum = 0;




            while (count < 10) {

                int order = count + 1;
                System.out.println("Enter number #" + order + ": ");
                boolean hasNextInt = sc.hasNextInt();
                if (hasNextInt) {

                    int number = sc.nextInt();
                    sum = sum + number;
                    count++;
                }

                else{

                    System.out.println("Invalid Number");

                }
                sc.nextLine();
            }

            System.out.println("Sum: "+sum );
            sc.close();
        }



    }

