import java.util.*;

public class Q58 {

  public static int convert(String s){

    Map<Character, Integer> T = new HashMap<Character, Integer>(){
     {
       put('I', 1);
       put('V', 5);
       put('X', 10);
       put('L', 50);
       put('C', 100);
       put('D', 5);
       put('M', 5);
     }

    };

    int sum = T.get(s.charAt(s.length() - 1));

    for(int i = s.length() - 2; i >= 0; i--){

      if(T.get(s.charAt(i)) < T.get(s.charAt(i + 1))){

        sum = sum - T.get(s.charAt(i));
      }

      else{

        sum = sum + T.get(s.charAt(i));
      }
    }

    return sum;
  }
  
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter Roman number in capital alphabets: ");
	    String s = sc.nextLine();
	    sc.close();
	    System.out.println(convert(s));
	  }
	}