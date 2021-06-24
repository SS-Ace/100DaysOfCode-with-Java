import java.util.Scanner;
public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a, b, c: ");
		int a = sc.nextInt();//200
		int b = sc.nextInt();//375 
		int c = sc.nextInt();//425
		sc.close();
	
		if((a < b) && (a < c) && (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) && ((a + b + c) == 1000)) {
			
			int res = a * b * c;
			System.out.println("It satisfies the conditions, so the required output is: "+res);
		}
		
		else {
			
			System.out.println("It did not satisfy the conditions.");
		}

	}

}
