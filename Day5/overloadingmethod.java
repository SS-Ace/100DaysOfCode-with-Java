public class overloadingmethod {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
double cm=0;

        if(feet >= 0 && inches >= 0 && inches <= 12 ){
            cm=feet*12*2.54;
            cm=cm+(inches*2.54);


            System.out.println(feet+" feet "+inches+" inches = "+cm+" cm");
            return cm;
        }


        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double reminches=0;
        double resfeet=0;
        double res=0;
        if(inches>=0){

            resfeet=(int)inches/12;
            reminches=(int)inches%12;

            System.out.println(inches+" = "+ resfeet +" feet and "+reminches+" inches");
      res=calcFeetAndInchesToCentimeters(resfeet,reminches);
      return res;


        }

        return -1;
    }

    public static void main(String[] args){

        calcFeetAndInchesToCentimeters(11.11);
    }
}
