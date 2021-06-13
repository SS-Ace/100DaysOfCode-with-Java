
public class Q22 {
	
	public static long multiply(long x, long y){
	long sum = 0;
	while (x != 0) {

	if ((x & 1) != 0) {
	sum = add(sum , y);
	}
	x >>>= 1 ;
	y <<= 1 ;
	}
	return sum;
	  }

	public static long add(long a, long b) {
	long sum = 0, carryin = 0, k = 1, tempA = a, tempB = b;
	while (tempA != 0 || tempB != 0) {
	long ak = a & k, bk = b & k ;
	long carryout = (ak & bk) | (ak & carryin)|(bk & carryin);
	sum |= (ak ^ bk ^ carryin);
	carryin = carryout<< 1;
	k <<= 1 ;
	tempA >>>= 1 ;
	tempB >>>= 1 ;
	}
	return sum | carryin;
	}
	
	  public static void main(String[] args) {
	   
	    long a=0b1100,b=0b0111;  //a=12, b=7
	    System.out.println(multiply(a,b)); //12 * 7 = 84

	  }

}
