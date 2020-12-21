
public class Q4PalindromeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,4,2,1};
		int n = array.length;
		palindrome(array,n);

	}

	public static void palindrome(int[] array, int n) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i=0;i<n/2&&n!=0;i++) {
			if (array[i] != array[n - i - 1]) {
				temp =1;
				break;
			}
		}
		if (temp==1) {
			System.out.println("Not Palindrome");
		} else {
		    System.out.println("Palindrome");
		}
				
				
	}
}

		
	


