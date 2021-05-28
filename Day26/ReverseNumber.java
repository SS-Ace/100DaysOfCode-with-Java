
public class ReverseNumber {
	
	public static int reverse(int x) {
		
		 if(x >= Math.pow(-2, 31) && x <= (Math.pow(2, 31) - 1)) {
				int n1, reversed = 0;
				while(x != 0) {
					n1 = x % 10;
					x = x / 10;
					
				
		     if(reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && n1 > 7)){
		               
		         return 0;
		                
		            }
		            
		 if(reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && n1 < -8)){
		                
		     return 0;
		                
		            }
		            reversed = n1  + reversed * 10;
				}
				
		     
		            
				return reversed;
				}
				
				else {
					
					return 0;
				}
			}
		
	public static void main(String[] args) {
		
		System.out.println(reverse(1534));
	}

}
