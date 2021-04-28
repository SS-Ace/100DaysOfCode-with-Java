public class FirstLastDigitSum {


    public static int sumFirstAndLastDigit(int number){

        int lastdigit = 0;
        int firstdigit = 0;


        if(number < 0) {

            return -1;


        }



        lastdigit = number % 10;

        firstdigit = number;

        while(firstdigit > 9){

            firstdigit = firstdigit / 10;


        }


        return firstdigit + lastdigit;









    }



        public static void main(String[] args){

            System.out.println(sumFirstAndLastDigit(12));

    }
}
