
public class Q6SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {10,4,2,6,3,8,5,9,20,15};
		for (int i=0;i<array.length;i++) {
			int temp = i;
			for (int j=i+1;j<array.length;j++) {
				if (array[j]<array[temp]) {
					temp = j;
				}
			}
			int smallerNum = array[temp];
			array[temp]=array[i];
			array[i] = smallerNum;
			System.out.print(array[i]+" ");
		}

	}
	

}
