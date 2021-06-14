import java.util.Scanner;
public class Q35 {

	public static int fibo(int n) {
		//the series take is: 0 1 1 2 3.......; hence here 0 is the first fibonacci number in consideration
		int count = 1, res = 0, num1 = 0, num2 = 1;
		while(count < n) {
            res = num1 + num2;
            num1 = num2;
            num2 = res;
            count++;
		}
	return res;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(fibo(n));
	}
}
