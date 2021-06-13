import java.util.Scanner;
public class Q5 {
	
	public static boolean check(double rec1[], double rec2[]) {
		
		
		if(Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) && 
		   Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1]))
					return true;
		// No need to give else statement, if it satisfies the condition then it'll return "true" automatically, else it'll return "false"
		// Ciao! :)
		return false;
	}
	
	//[206110757,199595273,851054072,983256382]
		//	[-898677230,-47320317,-858614307,736177810]

	public static void main(String[] args) {
		double point;
		//Enter one of the top  and one of the bottom co-ordinates such 
		//that they are opposite to each other like a diagonal
		double rec1[] = new double[4];
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter for rectangle 1: ");
		for(int i = 0; i < rec1.length; i++) {
			point = sc.nextDouble();
			rec1[i] = point;
			
		}
		
		
		double rec2[] = new double[4];
		//Enter one of the top  and one of the bottom co-ordinates such 
		//that they are opposite to each other like a diagonal
		
		System.out.println("Enter for rectangle 2: ");
		for(int i = 0; i < rec2.length; i++) {
			point = sc.nextDouble();
			rec2[i] = point;
			
		}
		
		sc.close();
		System.out.println(check(rec1, rec2));

	}

}
