public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second){

        if(first < 10 || second < 10){

            return -1;

        }

        int n1 = first;

        if(first > second){

            n1 = second;
        }

        int larg = 0;
        int i = 1;

        while(i <= n1){

            if(first % i == 0 && second % i == 0){

                larg = i;
            }

            i++;

        }



        return larg;

    }

    public static void main(String[] args){

        System.out.println(getGreatestCommonDivisor(15, 25));
    }
}