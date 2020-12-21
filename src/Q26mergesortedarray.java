
public class Q26mergesortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = {1,2,4,6,9,10};
		int array2[] = {3,5,7,8};
		int m=array1.length+array2.length;
		int[] arrayM=new int[m];
		for(int i=0;i<array2.length;i++) {
			arrayM[i]=array2[i];
			for(int j=0;j<array1.length;j++) {
				 arrayM[array2.length+j]=array1[j];
				}
			}
		for(int i=0;i<m;i++) {
			for(int j=i+1;j<m;j++) {
			int temp=0;
			if(arrayM[i]>arrayM[j]) {
				temp=arrayM[i];
				arrayM[i]=arrayM[j];
				arrayM[j]=temp;	
			}
			
		}
			System.out.print(arrayM[i]+" "); 
		}
	
	}
}


