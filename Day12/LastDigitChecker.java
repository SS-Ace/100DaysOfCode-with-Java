public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1 , int num2, int num3){


        if(!isValid(num1) || !isValid(num2) || !isValid(num3)){

            return false;
        }


        num1 = num1 % 10;

        num2 = num2 % 10;

        num3 = num3 % 10;

        return num1 == num2 || num2 == num3 || num1 == num3;



    }


    public static boolean isValid(int num){

        return num >= 10 && num <= 1000;
    }


    public static void main(String[] args){

        System.out.println(hasSameLastDigit(9, 99, 19));


    }

}
