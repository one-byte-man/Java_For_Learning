package lessons;

public class Lesson4 {

	public static void main(String[] args) {
		/**
		 * JAVA CONTROL FLOW: IF-ELSE, SWITCH & TERNARY  
		 * ---------------------------------------------------------
		 * IF / ELSE IF / ELSE: 
		 * - Used for complex boolean conditions and range checks (e.g., x > 10 && x < 20).
		 * * SWITCH CASE:
		 * - Used for equality checks against a single variable (int, char, String, Enum).
		 * * TERNARY OPERATOR (condition ? true : false):
		 * - A shorthand for simple if-else assignments.
		 * ---------------------------------------------------------
		 * MODERN SWITCH (Java 12+):
		 * - Uses '->' (arrow) instead of ':' (colon).
		 * - No 'break' needed (prevents fall-through bugs).
		 * - Multiple labels: case 1, 2, 3 -> ...
		 */
		
		//---------------------------------------
		// IF - ELSE
		
		int score = 85;
		int score1 = 100;
		
		if (score >= 90) {
		    System.out.println("A");	// F
		}
		else if (score >= 80) {
		    System.out.println("B"); 	// T
		}
		else {
		    System.out.println("C");  	// F
		}

		// In an if-else statement, "{}" brackets are not required for a single line.
		if ((score >= 50 && score1 >= 50) && (score > 80 || score1 == 100)) // You can create complex conditions using comparison and logical operators.
			System.out.println("Success!"); 
		else
			System.out.println("Failed!"); 
		
		//---------------------------------------
		// TERNARY
		
		int age = 20;
		// String score = (condition) ? "If true" : "If false";
		String status = (age >= 18) ? "Adult" : "Minor";
		System.out.printf("You are an %s%n",status);
		
		//---------------------------------------
		// SWITCH - CASE
		
		int level = 2;

		// Style 1
		String difficulty1;
		switch (level) {
		    case 1:
		    case 2:
		        difficulty1 = "Easy";
		        break; 	// If "break" is forgotten, the search flows downwards, causing errors.
		    case 3:
		        difficulty1 = "Medium";
		        break;
		    default:
		        difficulty1 = "Hard";
		}
		System.out.println(difficulty1);
		
		
		// Style 2 - Modern
		String difficulty2 = switch (level) {
		    case 1, 2 -> "Easy";    // Multiple labels are separated by commas.
		    case 3    -> "Medium";
		    default   -> "Hard";    // If used as this expression, "default" IS MANDATORY because we need to assigment a value to difficulty2
		};
		System.out.println(difficulty2);

		
		// Style 3 - Without assignment
		switch (level) {
		    case 1, 2	-> difficulty2 = "Easy";
		    case 3     	-> difficulty2 = "Medium";
		    default    	-> difficulty2 = "Hard"; // Not mandatory using default
		}
		System.out.println(difficulty2);
		
	}

}
