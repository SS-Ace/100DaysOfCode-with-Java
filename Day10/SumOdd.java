public class SumOdd {

    public static boolean isOdd(int parameter){

        if(parameter > 0 && (parameter % 2 != 0)){
            return true;
        }

        return false;
    }


    public static int sumOdd(int start, int end){
        if(start > 0 && end > 0 && end >= start){
            int sum=0;

            for(int i=start; i<=end; i++){

                if(isOdd(i)){
                    sum=sum+i;


                }
            }

            return sum;
        }

        return -1;
    }

    public static void main(String[] args){

        System.out.println(sumOdd(1,5));
    }
}
