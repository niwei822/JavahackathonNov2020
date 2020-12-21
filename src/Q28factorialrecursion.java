import java.util.Scanner;

public class Q28factorialrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a number:");
		int num = sc.nextInt();
		int factorial = factor(num);
		System.out.println("Factorial of entered number is: "+factorial);

	}

	public static int factor(int iNum) {
		// TODO Auto-generated method stub
		if (iNum==1) {
			return 1;
			
		}
		int output = iNum*(factor(iNum-1));
		return output;
		
		
		
	}

}
