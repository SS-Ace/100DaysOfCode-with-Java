
public class RabinKarpAlgorithm {

	public static int RabinKarp(String t, String s){

	    if(s.length() > t.length()){

	      return -1;

	    }

	    int base = 26;

	    int thash = 0, shash = 0;
	    int powers = 1;

	    for(int i = 0; i < s.length(); i++){

	      powers = i > 0 ? powers * base : 1;
	      thash = thash * base + t.charAt(i);
	      shash = shash * base + s.charAt(i);
	    }

	    for(int i = s.length(); i < t.length(); i++){

	      if(thash == shash && t.substring(i - s.length(), i).equals(s)){

	        return i - s.length();
	      }

	      thash = thash - t.charAt(i - s.length()) * powers;

	      thash = thash * base + t.charAt(i);
	    }

	    if(thash == shash && t.substring(t.length() - s.length()).equals(s)){

	      return t.length() - s.length();
	    }

	    return -1;
	  }
	  public static void main(String[] args) {
	    System.out.println(RabinKarp("GACGCCA", "CGC"));//the required output's starting index will be in output
	  }
	}