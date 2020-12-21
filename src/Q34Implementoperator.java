import java.util.ArrayList;

public class Q34Implementoperator {
	public int subtraction(int a, int b) {
		return a + negate(b);
	}

	private int negate(int a) {
		int neg = 0;
		int b = (a < 0) ? 1 : -1;
		while (a != 0) {
			a += b;
			neg += b;
		}
		return neg;
	}

	public int multiply(int a, int b) {
		if (a < b) {
			return multiply(b, a);
		}
		int sum = 0;
		for (int i = abs(b); i > 0; i--) {
			sum += a;
		}
		if (b < 0)
			sum = negate(sum);
		return sum;
	}

	private int abs(int b) {
		if (b < 0)
			return negate(b);
		else
			return b;
	}

	public int divide(int a, int b) {
		if (b == 0)
			throw new java.lang.ArithmeticException();
		int absa = abs(a);
		int absb = abs(b);
		int product = 0;
		int x = 0;
		while (absb + product <= absa) {
			product += absb;
			x++;
		}
		if ((a > 0 && b > 0) || (a < 0 && b < 0))
			return x;
		else
			return negate(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q34Implementoperator so = new Q34Implementoperator();
		int subtraction = so.subtraction(-99, -40);
		int multiply = so.multiply(2, -20);
		System.out.println("subtraction= " + subtraction);
		System.out.println("multipcation= "+multiply);
	
	}

}
