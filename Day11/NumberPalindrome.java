public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int lastdigit = 0;
        int n = number;

        if(n < 0){

            n = -1 * n;

            while(n > 0){

                lastdigit = n % 10;
                reverse = (reverse * 10) + lastdigit;
                n = n / 10;

            }

            reverse = -1 * reverse;

        }

        else {

            while(n > 0){

                lastdigit = n % 10;
                reverse = (reverse * 10) + lastdigit;
                n = n / 10;



            }
        }


        if(reverse == number){

            return true;
        }

        return false;
    }

}
