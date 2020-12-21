
public class Q17intergerchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HellO 123WoW7899 WorlD";
		int num = 0,uppercase =0,lowercase=0;
		for (int i=0;i<str.length();i++) {
			if (Character.isDigit(str.charAt(i))) {
				num++;
			}
			if (Character.isUpperCase(str.charAt(i))) {
				uppercase++;
			}
			if (Character.isLowerCase(str.charAt(i))) {
				lowercase++;
			}
		}
		System.out.println("No. of numbers : " + num);
		System.out.println("No. of lowercase letter : " + lowercase);
		System.out.println("No. of uppercase letter : " + uppercase);

	}

}
