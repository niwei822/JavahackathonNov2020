
public class Q63reverseArraybyGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Array [] = {3,2,4,7,0,3,1,5,8,4};
		//              0 1 2 3 4 5 6 7 8 9
		int k = 3;
		int n = Array.length;
		System.out.println("Before reverse: ");
		for (int i=0;i<n;i++)
		System.out.print(Array[i]+" ");
		
		// If k is not multiple of n where n is the size of the array, 
		//for the last group we will have less than k elements left, 
		//we need to reverse all remaining elements.
		for (int i=0;i<n;i=i+k) {
			int start=i;
			int end=Math.min(i+k-1, n-1);
			while (start<=end) {
				int temp=Array[start];
				Array[start]=Array[end];
				Array[end]=temp;
				start++;
				end--;
				
			}
		}
		System.out.println("\nAfter reversing by group: ");
		for (int i=0;i<n;i++) {
			System.out.print(Array[i]+" ");
		}

	}

}
