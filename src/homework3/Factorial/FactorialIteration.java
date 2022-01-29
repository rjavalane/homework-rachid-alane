package homework3.Factorial;
import java.util.Scanner;

public class FactorialIteration {
		static int factorial (int n) {
			int a = 1;
			for (int i=1; i <= n; i++) {
				a=a*i;
			}
			return a;
		}
	public static void main(String[] args) {
		int num;
		int result;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		result=factorial(num);
		System.out.println(num+"!"+" "+"="+" "+result);
	}

}
