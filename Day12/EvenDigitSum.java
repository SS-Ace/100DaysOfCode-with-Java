public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        int n=0, sum = 0;

        if(number < 0){
            return -1;
        }


        while(number > 0){
            n = number % 10;
            if(n % 2 == 0){
                sum = sum + n;

            }
            number = number / 10;


        }
        return sum;

    }

}