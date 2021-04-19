import java.util.Scanner; public class DQ7 
{ static int fact(int n) 
{ if(n==0) 
	return 1; 
else return n*fact(n-1); }
public static void main(String args[]) 
{ Scanner in =new Scanner(System.in); 
System.out.println("enter n value"); 
int a =in.nextInt(); 
int k =fact(a); 
System.out.println(k); }
}
