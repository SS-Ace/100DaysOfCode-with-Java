import java.util.*;

public class Q77 {
	
	public static boolean array(int arr[], int n, int diff)
	
	{
		int i = 0, j = 1;
     while (i < n && j < n) {
			if (i != j && arr[j] - arr[i] == diff) {
				return true;
			}
			else if (arr[j] - arr[i] < diff) {
				j++;
			}
			else {
				i++;
			}
		}
		return false;
	}

	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		System.out.println("Enter array elements: ");
		int arr[] = new int[n];
		for(int i = 0; i < n; i++ ) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the difference: ");
		int diff = sc.nextInt();
		sc.close();
		
		

		if (array(arr, n, diff)) {
			System.out.println("Pair for the required difference exist");
		}
		else {
			System.out.println("Pair for the required difference not found");
		}	
		}
}
