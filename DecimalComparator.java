public class DecimalComparator {

        public static boolean areEqualByThreeDecimalPlaces(double a, double b){
            int newa=(int)(a*1000);
            int newb=(int)(b*1000);
            if(newa==newb){
                return true;
            }

            else{
                return false;
            }
        }

    }

