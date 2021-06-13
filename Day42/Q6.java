
public class Q6 {

	public static void shift(int x,int i, int j){
	    if(((x >>> i) & 1) != ((x >>> j) & 1)){
	      int bitmask=(1 << i) | (1 << j);
	      x = x ^ bitmask;
	      String x1 = Integer.toBinaryString(x);
	      System.out.println(x1);
	    }
	  }
	  public static void main(String[] args) {
	    shift(0b10001111, 1, 6); //1st index exchanged with 6th index
	  }
}
