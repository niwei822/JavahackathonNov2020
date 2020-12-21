import java.util.Scanner;

public class Q23checkInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter integer, string or boolean:");
		
		String input = sc.nextLine();

		boolean isInt = true; 
        try { 
            int integer = Integer.parseInt(input); 
        } catch (NumberFormatException e) {
            isInt = false; 
        }

        if (isInt) {
            System.out.printf("It's Integer.");
        
        } else if ("true".equals(input.toLowerCase()) || "false".equals(input.toLowerCase())) {
            System.out.printf("It's Boolean.");
        } else {
            System.out.printf("It's String.");
        }

		
	}

}
