public class maxofthree {
	
	public static int max(int a, int b, int c) {
		
		if(a > b) {
			
			if(a > c) {
				
				return a;
			}
			
			else{
				
				return c;
				
			}
		}
		
		else {
			
			if(b > c) {
				
				return b;
			}
			
			else {
				
				return c;
			}
		}
	}

	public static void main(String[] args) {
		int a = -1, b = 0, c = 1;
		System.out.println(max(a,b,c));
		

	}

}
