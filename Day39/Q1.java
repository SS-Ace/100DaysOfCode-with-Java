import java.util.Scanner;

public class Q1 {
	
	public static int count(int n) {
		
		int fact = 1;
			
		for(int i = n; i >= 1; i--) {
			//factorial
			fact = i * fact;
			
		}
		
		int res = (int)Math.floor((fact + 1) / Math.E); // no. of derangements = ((n! + 1)/e);
		return res;
		}
		
		
		
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(count(n));
	}

}
