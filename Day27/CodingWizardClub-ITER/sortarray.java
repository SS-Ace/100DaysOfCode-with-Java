import java.util.*;
public class sortarray {
		public static int minswaps(int[] arr, int n)
		{
			int res = 0;
			int[] temp = Arrays.copyOfRange(arr, 0, n);
			Arrays.sort(temp);
			for (int i = 0; i < n; i++)
			{

				if (arr[i] != temp[i])
				{
					res++;

					swap(arr, i, index(arr, temp[i]));
				}
			}
			return res;
		}
		
		
		public static void swap(int[] arr, int i, int j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		
		public static int index(int[] arr, int a)
		{
			for (int i = 0; i < arr.length; i++)
			{
				if (arr[i] == a) {
					return i;
				}
			}
			return -1;
		}
	


     public static void main(String[] args) {
		
		int[] arr = {2,3,1,4,5};
	System.out.println("Minimum swaps required: "+minswaps(arr, arr.length));
	}

}
