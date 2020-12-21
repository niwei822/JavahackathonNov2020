import java.util.HashMap;

public class Q20repeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "123321 SStiOYit YOau 421 uaua xX";
	      str = str.replaceAll("\\s", ""); 
	      HashMap <Character, Integer> hMap = new HashMap<>();
	      for (int i = str.length() - 1; i >= 0; i--) {
	         if (hMap.containsKey(str.charAt(i))) {
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	         } else {
	            hMap.put(str.charAt(i),1);
	            
	            
	         }
	      }
	      for (Character key: hMap.keySet()) {
	    	  if (hMap.get(key) != 1) {
	    		  System.out.println(key + ":" + hMap.get(key));
	    	  }
	      }

	}

}
