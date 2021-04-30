public class PerfectNumber{
    public static boolean isPerfectNumber(int number){

        if(number < 1){

        return false;

        }

        int sum = 0;
        int i = 1;

        while(i < number){

        if(number % i == 0){

        sum = sum + i;

        if(sum == number){

        return true;


        }
        }

        i++;
        }

        return false;
        }

        public static void main(String[] args){

            System.out.println(isPerfectNumber(13));
        }
        }