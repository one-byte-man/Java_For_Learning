package lessons;

public class Lesson14 {

	/**
	 * JAVA EXCEPTION HANDLING
	 * ---------------------------------------------------------
	 * WHAT : A mechanism to handle runtime errors, maintaining normal application flow.
	 * WHY  : Prevents app crashes, allows resource cleanup, separates error-handling from core logic.
	 * ---------------------------------------------------------
	 * CORE KEYWORDS:
	 * - try     : Wraps code that might throw an exception.
	 * - catch   : Catches and handles the specific exception thrown in the try block.
	 * - finally : ALWAYS executes (unless System.exit() is called). Used to close resources.
	 * - throw   : Manually throws an exception object (e.g., throw new IllegalArgumentException("Error");)
	 * - throws  : Declares that a method might throw an exception, forcing the caller to handle it.
	 * ---------------------------------------------------------
	 * Notes:
	 * 1. Hierarchy   : Throwable -> Exception (Checked) & RuntimeException (Unchecked) & Error.
	 * 2. Catch Order : Always catch SUBCLASSES before SUPERCLASSES (e.g., catch ArithmeticException BEFORE Exception).
	 * 3. try-with-resources : try (Scanner s = new Scanner(System.in)) { ... } -> Auto-closes resources.
	 * 4. assert      : Used for debugging. Syntax: assert (condition) : "Error message"; (Needs -ea flag to run).
	 */
	
	public static void main(String[] args) {
		
		try {
            System.out.println("A");
            int result = 10 / 0;
            System.out.println("B");
        } catch (ArithmeticException e) {
            System.out.println("C");
        } catch (Exception e) {
            System.out.println("D");
        } finally {
            System.out.println("E");
        }
        System.out.println("F");
	}

}
