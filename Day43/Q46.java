import java.text.NumberFormat;
import java.util.Scanner;
public class Q46 {

	public static void main(String[] args) {
				
				//using discriminant(Quadratic equation)
		
				Scanner sc = new Scanner(System.in);
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double c = sc.nextDouble();
				sc.close();
				double x;
				NumberFormat nf = NumberFormat.getInstance();
				nf.setMaximumFractionDigits(2);
				
				double d = (Math.pow(b,2)-(4 * a * c));
				
				if(d > 0) {
					
					x = (-b - Math.sqrt(d)) / (2 * a);
					System.out.println(x);
					
					x = (-b + Math.sqrt(d))/(2 * a);
					System.out.println(x);
					 
				}
				
				if(d == 0) {
					
					x = -b / (2 * a);
					
					System.out.println(x);
					System.out.println(x);
				}
				
				if(d < 0) {
					
					
					System.out.println((-b / (2 * a))+"+"+(nf.format(( Math.sqrt(-1 * (Math.pow(b,2)-(4 * a * c))) )/ (2 * a))+"i"));
					System.out.println((-b / (2 * a))+"-"+(nf.format(( Math.sqrt(-1 * (Math.pow(b,2)-(4 * a * c))) )/ (2 * a))+"i"));
					
				}
				
				
				
			
			}


	}


