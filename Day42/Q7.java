import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side of a square: ");
		float side = sc.nextFloat();
		sc.close();
		
		System.out.println((float)((Math.PI / 4) * Math.pow(side, 2)));

	}

}
