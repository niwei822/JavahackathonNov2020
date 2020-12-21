

public class Q1CheckBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkBoolean (true, true, false);
		
		

	}

	public static void checkBoolean(boolean a, boolean b, boolean c) {
		// TODO Auto-generated method stub
		if (a || (b || c) && (b && c)) {
			System.out.println("At least 2 out 3 are true!");
		} else {
			System.out.println("Maxmium 1 out of 3 is true.");
		}
		return;
	}
	
	}

		
	


