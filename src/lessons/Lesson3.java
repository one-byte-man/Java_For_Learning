package lessons;

import java.util.Scanner;

public class Lesson3 {

	public static void main(String[] args) {
		
		/**
		 * JAVA ESCAPE SEQUENCES LIST 
		 * --------------------------------------------
		 * \n  : Newline - Moves the cursor to the next line.
		 * \t  : Tab - Shifts text to the right by a standard 8-character space.
		 * \b  : Backspace - Deletes the character preceding the cursor.
		 * \r  : Carriage Return - Returns the cursor to the beginning of the current line.
		 * \f  : Form Feed - Used in old printers to advance to the next page.
		 * \'  : Single Quote - Used to print the ' character within a string.
		 * \"  : Double Quote - Used to print the " character within a string.
		 * \\  : Backslash - Used to print the \ character itself.
		 * * Example Usage: 
		 * System.out.println("First Name:\tAhmet\nLast Name:\tAkpinar");
		 */
		
		System.out.print("I am");		//No end new line
		System.out.println(" Ahmet."); 	// End with new line
		// I am Ahmet.
		
		System.out.print("I am");
		System.out.print(" Ah\nmet.");
		System.out.println("End.");
		// I am Ah
		//met.End.
		
		System.out.println("First Name:\tAhmet\nLast Name:\tAkpinar");
		
		/**
		 * JAVA PRINTF FORMAT SPECIFIERS 
		 * ---------------------------------------------------------
		 * %s  : String       - For text strings.
		 * %d  : Integer      - For whole numbers (Decimal).
		 * %f  : Float/Double - For floating-point numbers.
		 * %n  : Newline      - For platform-independent new lines.
		 * ---------------------------------------------------------
		 * Example: System.out.printf("Name: %s, Age: %d", "Ahmet", 20);
		 */
		
		System.out.printf("Name: %s, number: %d, float: %f %n", "Ahmet", 2909, 23.99f); // Formatting print
		
		/**
		 * JAVA PRINTF FORMATTING CHEAT  
		 * ---------------------------------------------------------
		 * SYNTAX: %[flags][width][.precision]conversion-character
		 * * FLAGS:
		 * -  : Left-justify (Default is right-justify)
		 * +  : Output a plus (+) or minus (-) sign for numerical values
		 * 0  : Forcing numerical values to be zero-padded
		 * ,  : Comma grouping separator (e.g., 1,000,000)
		 * * WIDTH & PRECISION:
		 * %10s   : Minimum 10 characters wide, right-aligned
		 * %-10s  : Minimum 10 characters wide, left-aligned
		 * %.2f   : 2 decimal places (rounds automatically)
		 * %10.2f : 10 chars wide, 2 decimal places
		 * * EXAMPLES:
		 * System.out.printf("|%-10s|%n", "Hello");  -> |Hello     |
		 * System.out.printf("|%10s|%n", "Hello");   -> |     Hello|
		 * System.out.printf("%05d%n", 42);           -> 00042
		 * System.out.printf("%,d%n", 1000000);       -> 1,000,000
		 * ---------------------------------------------------------
		 */
		
		System.out.printf("|%-10s|%n", "Hello");
		System.out.printf("|%10s|%n", "Hello");
		System.out.printf("%05d%n", 42);
		System.out.printf("%,d%n", 1000000);
		
		
		Scanner input = new Scanner(System.in); // Create a new object of Scanner class called 'input'
		
		System.out.println("Enter a number: ");
		int number = input.nextInt(); // Read first number
		System.out.printf("Entered number is : %d%n",number);

	}

}
