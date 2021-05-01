public class NumberToWords {

    public static void numberToWords(int number) {


        int n = reverse(number);
        int n2 = 0;
        int reverse = reverse(number);
        int reverse2 = reverse;

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        else {
            if (reverse == 0) {
                System.out.println("Zero");
            }

            if (getDigitCount(reverse) != getDigitCount(number)) {


                while (n != 0) {

                    switch (n % 10) {

                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;


                    }

                    n = n / 10;


                }

                int countzero = getDigitCount(number) - getDigitCount(reverse);

                int i = 0;
                while(i < countzero){

                    System.out.println("Zero");
                    i++;
                }

            }
        else {
                while (reverse2 != 0) {


                    n2 = reverse2 % 10;
                    reverse2 = reverse2 / 10;

                    switch (n2) {

                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;


                    }


                }

            }

        }

    }

    public static int reverse(int number){


        int reverse = 0;
        int n = 0;
        int n2 = number;
        while(n2 != 0){

            n = n2 % 10;
            reverse = (10 * reverse) + n;
            n2 = n2 / 10;



        }





        return reverse;

    }

    public static int getDigitCount(int number){

        if(number == 0){
            return 1;
        }

        if(number < 0){

            return -1;
        }

        int count = 0;
        while(number != 0){
            number = number / 10;
            count++;

        }

        return count;

    }


    public static void main(String[] args){

        System.out.println(getDigitCount(-1));
        System.out.println(reverse(1234));

        numberToWords(1000);

    }
}