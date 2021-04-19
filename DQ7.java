// Program to find factorial of a number
// Concept used:- Recursion

import java.util.Scanner;
public class DQ7 
{ 
	static int fact(int n) 
	{ 
		if(n==0) 
			return 1; 
		else 
			return n*fact(n-1); 
	}

	public static void main(String args[]) 
	{ 
		Scanner in =new Scanner(System.in); 
		System.out.println("Enter value of n>>"); 
		int a = in.nextInt(); 
		int k = fact(a); 
		System.out.println(k); 
		in.close();
	}
}

// Time complexity = O(N)
// Space complexity = O(N)
