public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature){

        if((temperature >= 25 && temperature <= 35) || ((summer) && temperature>=25 && temperature <=45 )){

            return true;
        }

        return false;

    }

    public static void main(String[] args){

        System.out.println(isCatPlaying(true,45));
    }

}