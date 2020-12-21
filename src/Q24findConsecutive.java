import java.util.Scanner;

public class Q24findConsecutive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a positive number:");
		int num = sc.nextInt();
		int sum = 0;
		int c = 0;
		int j = 0;
		for (int i=1;i<num;i++) {
			sum = i;
			j = i+1;
			while (sum<num) {
				sum = sum + j;
				j++;
			}
			if (sum==num) {
				for (int k=i;k<j;k++) {
					if(k==i)
						System.out.print(k);
					else
						System.out.print(" + "+k);
						
						
				}
				System.out.println();
			}
		}
		

	}

}
