public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal){

        int biginkg= bigCount * 5;
        if(bigCount >= 0 && smallCount >= 0 && goal >= 0){


            if(((biginkg + smallCount) >= goal) && (smallCount >= (goal % 5)) ){

                return true;
            }

        }

        return false;
    }
}