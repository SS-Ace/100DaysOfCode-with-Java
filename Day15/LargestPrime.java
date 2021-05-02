public class LargestPrime {

    public static int getLargestPrime(int number) {

        int larg = 0;
        int factor = 0;
        int count = 0;

        if (number < 2) {

            return -1;
        }

       for(int i = 2; i <= number; i++){
           count = 0;
           if(number % i == 0){

               factor = i;
               System.out.println(factor);
               for(int j = 2; j <= Math.sqrt(factor); j++){

                   if(factor % j == 0){


                       count++;


                   }

               }


               if(count == 0){

                   if(larg < factor){

                       larg = factor;
                   }
               }
           }

       }

       return larg;


    }

    public static void main(String[] args){

        System.out.println(getLargestPrime(10));
    }

}


