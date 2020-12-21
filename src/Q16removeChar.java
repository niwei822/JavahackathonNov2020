
public class Q16removeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a state";
		str = removeChar(str, 's');
		System.out.println(str);

	}

	private static String removeChar(String str, char c) {
		// TODO Auto-generated method stub
		if (str==null) {
		return null;
	}
		return str.replaceAll(Character.toString(c), "");
		

	
	}
}


