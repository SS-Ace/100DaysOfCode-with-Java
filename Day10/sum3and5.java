public class sum3and5 {

    public static boolean number(int i){
if(i % 3 == 0 && i % 5 == 0){
    return true;
}
return false;
    }




    public static void main(String[] args){
        int sum=0,n=0;
        for(int i=1;i <= 1000; i++){

            if(number(i)){
                System.out.println("Required number: "+i);
                n++;
                sum=sum+i;
                if(n==5){
                    System.out.println("Sum: "+sum);
                    break;
                }
            }
        }
    }
}

