import java.util.Arrays;

public class Q3sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {42,34,76,3,56,100,9,15};
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
			System.out.print(array[i]+" ");
			
			
		}
	
	 
		

	}

}
