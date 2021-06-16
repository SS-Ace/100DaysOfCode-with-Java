
public class Q49 {

	public static void main(String[] args) {
			
		for(int i = 0; i < 5; i++) {
		
				for(int j = 2 * (5 - i); j >= 0; j--) {
			
		         System.out.print(" ");
				
			}
				
				for(int k = 0; k <= i; k++) {
				System.out.print("* ");
				}
			System.out.println();
		}
       
	}

}
