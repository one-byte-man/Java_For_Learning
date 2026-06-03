package lessons;
import java.util.EnumSet;



public class Lesson12 {
	
	/**
	 * JAVA ENUM TYPES
	 * ---------------------------------------------------------
	 * INIT : public enum EnumName { CONST1, CONST2; }
	 * RANGE: EnumSet.range(EnumName.CONST1, EnumName.CONST2)
	 * ---------------------------------------------------------
	 * CORE METHODS:
	 * - EnumName.values() : Returns an array of all constants in the enum
	 * - enumObj.name()    : Returns the exact string name of the enum constant
	 * - enumObj.ordinal() : Returns the position of the constant in its declaration
	 * ---------------------------------------------------------
	 * Notes:
	 * 1. Modifiers: Enum constants are implicitly public, static, and final.
	 * 2. Instantiation: Cannot be instantiated with the 'new' keyword.
	 * 3. Structure: Constants must be declared first, before any fields or constructors.
	 */

	public enum Book {
	    
	    // Declare constants of enum type (Must be first)
	    JHTP("Java How to Program", "2018"),
	    CHTP("C How to Program", "2016"),
	    IW3HTP("Internet & World Wide Web How to Program", "2012"),
	    CPPHTP("C++ How to Program", "2017"),
	    VBHTP("Visual Basic How to Program", "2014"),
	    CSHARPHTP("Visual C# How to Program", "2017");

	    private final String title; 
	    private final String copyrightYear; 

	    // Enum constructor (Implicitly private, binds arguments to fields)
	    Book(String title, String copyrightYear) {
	        this.title = title;
	        this.copyrightYear = copyrightYear;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getCopyrightYear() {
	        return copyrightYear;
	    }
	}

}
