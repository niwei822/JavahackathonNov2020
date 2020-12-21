import java.util.Scanner;

public class Q2factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multip = 1;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		for (int count = 1;count<=num;count++) {
			multip = multip*count;
		}
		System.out.println(num+"! = "+multip);

	}
	

}
