
public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
        int number = x;    
		int n1, reversed = 0;
        if(x >= Math.pow(-2, 31) && x <= (Math.pow(2, 31) - 1)) {
        
		while(x != 0) {
			n1 = x % 10;
			x = x / 10;
		    reversed = n1  + reversed * 10;
		}
		
     
            
		
		}
		
		else {
			
			reversed = 0;
		}
        
        if(number < 0) {
        	
        	reversed = -1 * reversed;
        }
        
        if(number == reversed){
            
            return true;
        }
        
        else{
            
            return false;
        }
	}
        
    
        

	public static void main(String[] args) {
		int n = 10;
		System.out.println(isPalindrome(n));

	}

}
