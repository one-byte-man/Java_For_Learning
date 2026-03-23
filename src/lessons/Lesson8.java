package lessons;

public class Lesson8 {

	public static void main(String[] args) {
		/**
		 * JAVA MATH CLASS (ALL METHODS ARE STATIC)
		 * ---------------------------------------------------------
		 * - Math.abs(x)    : Returns the absolute value (|-5| -> 5).
		 * - Math.pow(x, y) : Returns x to the power of y (x^y).
		 * - Math.sqrt(x)   : Returns the square root of x.
		 * - Math.max(x, y) : Returns the larger of two values.
		 * - Math.min(x, y) : Returns the smaller of two values.
		 * ---------------------------------------------------------
		 * ROUNDING FUNCTIONS:
		 * - Math.ceil(x)   : Rounds UP to the nearest integer (9.1 -> 10.0).
		 * - Math.floor(x)  : Rounds DOWN to the nearest integer (9.9 -> 9.0).
		 * - Math.round(x)  : Rounds to the nearest whole number (Standard rounding).
		 * ---------------------------------------------------------
		 * CONSTANTS:
		 * - Math.PI        : 3.141592653589793
		 * - Math.E         : 2.718281828459045
		 * ---------------------------------------------------------
		 * TRIGONOMETRY:
		 * - Math.sin(rad) / Math.cos(rad) / Math.tan(rad) (Input is in Radians!)
		 * And more...
		 */
		
		/**
		 * CRITICAL JAVA API PACKAGES & CLASSES
		 * ---------------------------------------------------------
		 * java.lang (Automatically Imported):
		 * - System : Standard input/output & time (System.out,...).
		 * - String : Text manipulation and concatenation
		 * - Math   : Common mathematical calculations
		 * ---------------------------------------------------------
		 * java.util (Must be Imported):
		 * - Scanner : Receiving input from the user (System.in).
		 * - Random  : Casual random number generation.
		 * - ArrayList: Dynamic arrays that can grow in size. 
		 * ---------------------------------------------------------
		 * java.security (Must be Imported):
		 * - SecureRandom: Non-deterministic, secure random numbers for games.
		 */
		

        System.out.println(Math.abs(-5));          
        System.out.println(Math.pow(2, 3));        
        System.out.println(Math.sqrt(64));         
        System.out.println(Math.max(10, 20));      
        System.out.println(Math.min(10, 20));      


        System.out.println(Math.ceil(9.1));
        System.out.println(Math.floor(9.9));
        System.out.println(Math.round(9.4));       


        System.out.println(Math.PI);
        System.out.println(Math.E);


        double rad = Math.toRadians(90);
        System.out.println(Math.sin(rad));
        System.out.println(Math.cos(rad));
        System.out.println(Math.tan(rad));     
        
        double num = Math.sqrt(2)/2; // equal to 'rad'
        System.out.println(Math.sin(rad));

        int powerInt = (int) Math.pow(3, 2);       
        System.out.println(powerInt);
       
        
        //I will continue from here
	}

}
