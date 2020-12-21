import java.util.Scanner;

public class Q5uniqueandduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,5,5,3,6,8,3,2};
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			boolean isDistinct = false;
			for (int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					isDistinct = true;
					break;
				}
			}
			
			if (!isDistinct) {
				System.out.print(a[i]+" ");	
			}
		}
		System.out.print("\n");
		int count = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter which number you want to check occurrences:");
		int duNum = sc.nextInt();
		for (int i=0;i<a.length;i++) {
			if (a[i]==duNum) {
					count++;
				}
			}
		
		System.out.println("The number of occurrences of number "+duNum+" is: "+count);

	}
}


