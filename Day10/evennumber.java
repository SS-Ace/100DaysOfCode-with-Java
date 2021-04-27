public class evennumber {

    public static boolean isEvenNumber(int a) {
     /*   if (a > 0) {
            while (true) {
                if (a % 2 == 0) {
                    return true;
                } else {
                    break;
                }
            }
        }
            return false;*/

        if(a > 0 && a % 2 == 0){
            return true;
        }

        return false;
    }


    public static void main(String[] args){

        int number = 4, finishnumber = 20, count=0;

        while(number <= finishnumber){

            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            count++;
            System.out.println("Even number: "+number);
            if(count == 5){
                break;
            }


        }

        System.out.println("Total no. of even numbers: "+count);

    }
}
