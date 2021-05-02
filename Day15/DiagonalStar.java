public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {

            System.out.println("Invalid Value");

        } else {
            for (int row = 1; row <= number; row++) {

                for (int column = 1; column <= number; column++) {

                    if (row == 1 || column == 1 || row == number || column == number) {

                        System.out.print("*");
                    } else if (row == column) {

                        System.out.print("*");
                    } else if (column == (number - row + 1)) {

                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }

    }


    public static void main(String[] args){
        printSquareStar(5);
    }
}