
public class reverse_a_string {

	public static void main(String[] args) {
		
		String s ="HeLlo";
		
		String s2 = "";
		
		for(int i = s.length() - 1; i >= 0; i--) {
			
			s2 = s2 + s.charAt(i);
			
		}
      
		s = s2;
		
		
		
		System.out.println("Reversed string:"+s);
	}

}
