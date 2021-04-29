public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2){

        int n1 = 0, n2 = 0, n3= 0,n4 = 0;

        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){

            return false;
        }

        n1 = num1 % 10;
        n2 = num2 % 10;
        num1 = num1 / 10;
        n3 = num1 % 10;
        num2 = num2 / 10;
        n4 = num2 % 10;

        if(n1 == n2 || n1 == n3 || n1 == n4 || n2 == n3 || n2 == n4 || n3 == n4){

            return true;
        }

        else {

            return false;
        }



    }

}