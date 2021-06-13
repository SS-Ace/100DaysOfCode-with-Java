import java.util.Arrays;

public class Q23 {
	
	public static int[] merge(int arr1[], int arr2[]) {
		
		int arr[] = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		
		while(j < arr1.length && k < arr2.length) {
		
			
				arr[i++] = arr1[j++];
				arr[i++]=arr2[k++];
		
		}
		
		while(j < arr1.length) {
			
			arr[i++] = arr1[j++];
		}
		
		
		while(k < arr2.length) {
			
			arr[i++] = arr2[k++];
		}
		
		return arr;
	}

	public static void main(String[] args) {
		
		int arr1[] = new int[] {1, 4, 6, 8};
		int arr2[] = new int[]{11, 19, 10, 7};
		
		System.out.println(Arrays.toString(merge(arr1, arr2)));
	}

}
