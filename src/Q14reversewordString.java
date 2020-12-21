

public class Q14reversewordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java Code";
		String[] words = str.split(" ");
		String revstr = "";
			for(int j=words.length-1;j>=0;j--) {
			  revstr=revstr+" "+words[j];	 
			}
			String revstr1 = revstr.trim();
	System.out.println(str);
	System.out.println(revstr1);
		

}
}
