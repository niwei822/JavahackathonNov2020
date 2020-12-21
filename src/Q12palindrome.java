
public class Q12palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MalayalaM";
		String rev = "";
		int n = str.length();
		for (int i=n-1;i>=0;i--) {
			rev = rev + str.charAt(i);
			
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println(str+" is a palindrome.");
		}
		else {
			System.out.println(str+" is not a palindrome.");
		}

	}

}
