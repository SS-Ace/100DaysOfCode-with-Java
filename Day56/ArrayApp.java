package Arrays1;
//Procedural method
public class ArrayApp {

	public static void main(String[] args) {
		long[] arr;
		arr = new long[100];
		int nElems = 0;
		int j;
		long searchkey;
		
		arr[0] = 77; 
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
		nElems = 10;
		
		for(j = 0; j < nElems; j++) {
			System.out.print(arr[j]+" ");
			}
		System.out.println("");
		
		searchkey = 55;
		for(j = 0; j < nElems; j++) {
			
			if(arr[j] == searchkey) {
				break;
			}
		}
		for(int k = j; k < nElems - 1; k++) {
			arr[k] = arr[k + 1];
		}
        
		nElems--;
		
		for(j = 0; j < nElems; j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println("");
		
	}

}
