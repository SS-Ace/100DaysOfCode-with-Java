public class switchchallenge{

    public static void switch1(char a) {

        switch (a) {

            case 'A':
                System.out.println("A found");
                break;


            case 'B':
                System.out.println("B found");
                break;

            case 'C':
                System.out.println("C found");
                break;

            case 'D':
                System.out.println("D found");
                break;

            case 'E':
                System.out.println("E found");
                break;

            default:
                System.out.println("not found");
                break;
        }
    }
    public static void main(String[] args){
        char a='A';

        switch1(a);
        switch1(a='B');
        switch1(a='c');
        }
}
