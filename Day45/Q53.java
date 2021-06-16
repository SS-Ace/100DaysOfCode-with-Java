import java.util.Scanner;

public class Q53 {
	
	public static void series(int n) {
		int count = 0;
		int i = 1;
	while(count <= n) {
			
			System.out.print((int)Math.pow(i, 2)+" ");
		    count++;
		    
		if(count < n) {
		System.out.print((int)Math.pow(i, 3)+" ");
		i++;
		count++;
		
		if(count == n) {
			break;
		}
		}
		
		else if(count == n) {
			
			break;
		}
			
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		
		series(n);

	}

}
