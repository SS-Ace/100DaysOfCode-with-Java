public class forloopchallenge {

    public static void calculateInterest(double amount){

        for(double i=2;i<9;i++){

            System.out.println(+amount+" at "+i+" % : " +(amount * (i / 100)));
        }

        for(double i=8;i>=2;i--){

            System.out.println(+amount+" at "+i+" % : " +String.format("%.2f",(amount * (i / 100))));
        }
    }

    public static void main(String[] args){

        calculateInterest(10000.0);
    }
}
