import java .util.*;
public class arraysort2d { 
			 

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();
		
		int arr[][] = new int[rows][columns];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				int num = sc.nextInt();
				arr[i][j] = num;
	 }
	}


		System.out.println("Original 2D array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
			
				System.out.print(arr[i][j]+" ");
		}
			System.out.println();
		}
		
		System.out.println("Enter 1 for ascending order and 2 for descending order");
		
		int choice = sc.nextInt();
		sc.close();
		
		switch(choice) {
		
		case 1:
			for (int i = 0; i < rows; i++) {
			 for (int j = 0; j < rows; j++) {
				 for (int k = 0; k < columns; k++) {
					 for (int l = 0; l < columns; l++) {
			 
			      if (arr[i][k] < arr[j][l]) {
			           int temp = arr[i][k];
			           arr[i][k] = arr[j][l];
			           arr[j][l] = temp;
			           
			      }
			      
					 }
					 
				 }
			 }
		}
			
			System.out.println("Sorted 2D array:");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
				
					System.out.print(arr[i][j]+" ");
			}
				System.out.println();
			}
			
			break;
			
		case 2: for (int i = 0; i < rows; i++) {
			 for (int j = 0; j < rows; j++) {
				 for (int k = 0; k < columns; k++) {
					 for (int l = 0; l < columns; l++) {
			 
			      if (arr[i][k] > arr[j][l]) {
			           int temp = arr[i][k];
			           arr[i][k] = arr[j][l];
			           arr[j][l] = temp;
			           
			      }
			      
					 }
					 
				 }
			 }
		}

		System.out.println("Sorted 2D array:");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
			
				System.out.print(arr[i][j]+" ");
		}
			System.out.println();
		}
		break;
		}
			
			
	
}

}
	
