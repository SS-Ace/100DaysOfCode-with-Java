import java.util.Scanner;
public class pattern_output {
	
	public static int solve(String num) {
		
		String n = "";
		String number = "";
		int sum = 0;
		int i = 1;
		while(i <= 3) {
			
			
		    number = number + num;
		    n = number;
		    sum = sum + Integer.parseInt(n);
		    n = "";
		    i++;   
			
		}
	
		return sum;
		
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		String num = sc.nextLine();
		System.out.println("Output: "+solve(num));
		sc.close();
	
    
	}

}
