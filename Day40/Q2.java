import java.util.Scanner;

public class Q2 {

	public static int partialsum(int n) {
		
		
		int arr[] = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i = 3; i < n; i++ ) {
			
			arr[i] = arr[i - 1] + arr[i - 2] ;
			
			}
		
		int sum = 0;
		
	for(int i = 0; i < n; i++) {
		
		sum = sum + arr[i];
	}
	
	return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upto which term the partial sum is needed:");
		//like for n = 5 represents the first five fibonacci numbers 
		int n = sc.nextInt();
		sc.close();
		
		System.out.println(partialsum(n)); //first n terms
	}

}
