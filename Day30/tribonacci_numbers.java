import java.util.Scanner;

public class tribonacci_numbers {

			
		public static int tribonacci(int n)
		{
			
			if (n == 0 || n == 1 || n == 2) {
				
				return 0;
				
			}
				
			if (n == 3) {
				
				return 1;
			}
				
			else {
				return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
			}
		}
		
		
		public static void main(String args[])
		{
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the Number to Calculate the Tribonacci: ");
			int number = scn.nextInt();
			
			for (int i = 1; i < number; i++)
				System.out.print(tribonacci(i)+" ");
		}
	
}
