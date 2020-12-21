import java.util.HashMap;

public class Q19occurenceofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      String str = "g abc abc ddd xxyyzz f";
		      str = str.replaceAll("\\s", ""); 
		      HashMap <Character, Integer> hMap = new HashMap<>();
		      for (int i = str.length() - 1; i >= 0; i--) {
		         if (hMap.containsKey(str.charAt(i))) {
		            int count = hMap.get(str.charAt(i));
		            hMap.put(str.charAt(i), ++count);
		            //System.out.println((int)(str.charAt(i)));
		         } else {
		            hMap.put(str.charAt(i),1);
		            
		            
		         }
		      }
		      for (Character key: hMap.keySet()) {
		    		  System.out.println(key + ":" + hMap.get(key));
		      }
		   }

	}


