
public class Q13reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = ("Java Code");
		String rev = "";
		int n = str.length();
		for (int i=n-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

	}

}
