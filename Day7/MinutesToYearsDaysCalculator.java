public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        long years = 0;
        long days = 0;
        if (minutes >= 0) {


            years = (long) minutes / (365 * 24 * 60);

            days = (long) (minutes % (365 * 24 * 60)) / (24 * 60);


            System.out.println(minutes + " min = " + years + " y and " + days + " d");


        } else {
            System.out.println("Invalid Value");
        }

    }
        public static void main(String[] args){

        printYearsAndDays(561600);
        printYearsAndDays(-1);
        }

}