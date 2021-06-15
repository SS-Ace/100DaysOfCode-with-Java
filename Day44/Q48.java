import java.util.Scanner;

public class Q48 {
	
	public static double power(double x, int y){
		double result = 1.0;
		long power = y;
		
		if (y < 0) {
		
			power = -power;
			x = 1.0 / x ;
		
		}
		while (power != 0) {
		
			if ((power & 1) != 0) {
		
				result *= x;
		}
		
			x *= x ;
			power >>>= 1 ;
		}
			return result ;
		  }
		 
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    double x = sc.nextDouble();
		    int y = sc.nextInt();
		    sc.close();
		    System.out.println(power(x, y));
		  }
}
