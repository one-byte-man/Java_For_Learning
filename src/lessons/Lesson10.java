package lessons;
import java.util.*;

public class Lesson10 {
	
	/**
	 * JAVA EXCEPTION HANDLING: TRY-CATCH-FINALLY  
	 * ---------------------------------------------------------
	 * PURPOSE : To handle runtime errors and prevent app crashes.
	 * STRUCTURE: 
	 * - try     : Block of code to monitor for exceptions.
	 * - catch   : Block that executes IF an exception occurs.
	 * - finally : Always executes, regardless of an exception (Cleanup).
	 * ---------------------------------------------------------
	 * COMMON EXCEPTIONS:
	 * - ArrayIndexOutOfBoundsException : Invalid array index.
	 * - ArithmeticException            : Division by zero.
	 * - NullPointerException           : Accessing a null object.
	 * - InputMismatchException         : Wrong data type from Scanner.
	 * ---------------------------------------------------------
	 * KEYWORDS:
	 * - throw  : Manually triggers an exception (e.g., throw new Exception()).
	 * - throws : Declares that a method MIGHT throw an exception.
	 * ---------------------------------------------------------
	 * Notes:
	 * 1. Specificity: Catch specific exceptions before general 'Exception' class.
	 * 2. Silent Catch: Never leave a catch block empty; at least log the error.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int[] serverData = {10, 20, 30, 0, 50};
	
	    try {
	        System.out.print("Enter the data index to access (0-4): ");
	        int index = scanner.nextInt();
	
	        int value = serverData[index];
	        int result = 100 / value;
	        
	        System.out.println("Result: " + result);
	
	    } catch (InputMismatchException e) {
	        System.err.println("CRITICAL ERROR: Please enter an integer only!");
	    } catch (ArrayIndexOutOfBoundsException e) {
	        System.err.println("DATA ERROR: Invalid index! You are out of bounds.");
	    } catch (ArithmeticException e) {
	        System.err.println("MATH ERROR: Division by zero is not allowed!");
	    } catch (Exception e) {
	        // General fallback for unexpected issues
	        System.err.println("UNEXPECTED ERROR: " + e.getMessage());
	    } finally {
	        // Cleanup phase: crucial for memory management
	        System.out.println("System: Releasing resources...");
	        scanner.close();
	    }
    
	    System.out.println("Status: Program continues running smoothly...");
	}

}
