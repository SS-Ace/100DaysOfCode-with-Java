import java.util.Scanner;
public class DominoPilling50A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		if(m >= 1 && m <= n && n <= 16) {
			
			int total = m * n;
			total = total / 2;
			
			System.out.println(total);
		}
		
		

	}

}
