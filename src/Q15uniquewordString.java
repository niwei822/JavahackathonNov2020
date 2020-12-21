import java.util.Arrays;
import java.util.HashSet;

public class Q15uniquewordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "apple is fruit and orange is fruit both fruit ";
		String[] strArray = str.split("\\s+");
		HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(strArray));
		for (String s:uniqueWords) 
			System.out.println(s);

	}

}
