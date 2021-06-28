package Arrays2;
//lowarrayapp
public class lowarrayApp {

	public static void main(String[] args) {
		
		lowarray arr = new lowarray(100);
		int searchkey;
		int nElems = 0;
		int j;
		arr.setElem(0, 77);
		arr.setElem(1, 99);
		arr.setElem(2, 44);
		arr.setElem(3, 55);
		arr.setElem(4, 22);
		arr.setElem(5, 88);
		arr.setElem(6, 11);
		arr.setElem(7, 00);
		arr.setElem(8, 66);
		arr.setElem(9, 33);
		nElems = 10;
		
		for(j = 0; j < nElems; j++) {
			System.out.print(arr.getElem(j)+" ");
		}
		
		System.out.println("");
		
		
		searchkey = 26;
		for(j = 0; j < nElems; j++) {
			if(arr.getElem(j) == searchkey) {
				break;
			}
		}
		
		if(j == nElems) {
			System.out.println("Not found "+searchkey);
		}
		
		else {
			System.out.println("Found "+searchkey);
		}
		
		//delete 55
		for(j = 0; j < nElems; j++) {
			
			if(arr.getElem(j) == 55) {
				break;
			}
		}
		
		for(int k = j; k < (nElems - 1); k++) {
			arr.setElem(k, arr.getElem(k + 1));
		}
       nElems--;
       
       for(j = 0; j < nElems; j++) {
    	   System.out.print(arr.getElem(j)+" ");
       }
       System.out.println("");
       
	}

}
