package homework3.Factorial;
import java.util.Scanner;

public class FactorialRecursion {
	static int factorial (int n) {
		if (n <=1)
			return 1;
		else return n * factorial(n-1); 
		
	}

	public static void main(String[] args) {
		int num;
		int result;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a Number");
		num = sc.nextInt();
		result = factorial(num);
		System.out.println(num+"!"+"="+result);
	}

}
