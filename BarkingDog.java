public class BarkingDog {

        public static boolean shouldWakeUp(boolean barking, int hourOfDay){
            if(barking){


                if(hourOfDay >= 0 && hourOfDay <= 23){

                    if(hourOfDay < 8 || hourOfDay > 22){
                        return true;
                    }
                }
            }


            return false;

        }

    }

