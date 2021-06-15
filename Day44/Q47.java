import java.util.Scanner;
public class Q47 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		int digits = a, num = 0, count = 0, sum = 0, a2 = a;
				
		
		while(digits != 0) {
			
			digits = digits / 10;
			count++;
			
		}
		
       
		while(a2 != 0) {
			
			num = a2 % 10;
			a2 = a2 / 10;
			num = (int)Math.pow(num, count);
			sum = num + sum;
			
		}
		
	
	
	if(a == sum) {
		
		System.out.println("It's an Armstrong number.");
		
	}

	else {
		System.out.println("It's not an Armstrong number.");
	}
}
}
