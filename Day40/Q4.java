
public class Q4 {
	
	public static boolean check(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		
		double d1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double d2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		double d3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		double d4 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));
	
		
		double diag = Math.sqrt(Math.pow(x2 - x4, 2) + Math.pow(y2 - y4, 2));
		
		if(d1 == 0 || d2 == 0 || d3 == 0 || d4 == 0) {
			
			return false;
			
		}
		
		if(d1 == d3 && d2 == d4) {
			
			if(Math.pow(diag, 2) == (Math.pow(d4, 2) + Math.pow(d1, 2)) ) {
				
				return true;
			}
			
			else {
			return false;
			}
		}

		return false;
		
	}

	public static void main(String[] args) {
		
		System.out.println(check(-3,2,4,2,4,-3,-3,-3));

	}

}
