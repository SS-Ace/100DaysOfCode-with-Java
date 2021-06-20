import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr1[] = new int[size];
		int arr2[] = new int[arr1.length];
		int count = 0;
		
		int j = 0;
		for(int i = 0; i < size; i++) {
			arr1[i] = sc.nextInt();
		}
		sc.close();
		
		for(int i = 0; i < size; i++) {
			if(arr1[i] > 0) {
             
				arr2[j] = arr1[i]; 
				j++;
				count++;
			}
		}
		
		if(count > 0) {
		for(int i = 0; i < arr1.length; i++) {
			
			if(arr1[i] < 0) {
				arr2[j] = arr1[i];
				j++;
			}
		}

		for(int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i]+" ");
		}
		}
	}
	
}


