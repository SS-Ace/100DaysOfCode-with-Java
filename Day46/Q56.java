import java.util.Scanner;

public class Q56 {
	
	
	public static boolean check(int num) {
    
		int res = 0, sum = 0, num2;
		
		while(num != 0) {
			
			res = num % 10;
			sum = sum + res;
			num = num / 10; 
			
			if(sum == 1) {
				return true;
			}
		}
		

		if(sum == 10) {
			
		num2 = sum;
		res = 0;
		sum = 0;
		
		while(num2 != 0) {
			
			res = num2 % 10;
			sum = sum + res;
			num2 = num2 / 10;
		}
		
		if(sum == 1) {
			
			return true;
			
		}
		
		}
		
		return false;
		
	}

		
	

	public static void main(String[] args) {
	   
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(check(num));
	
	}
}
