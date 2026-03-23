package lessons;

public class Lesson6 {
	
	/**
	 * ACCESS MODIFIERS (Visibility)  
	 * ---------------------------------------------------------
	 * PUBLIC    : Everyone can see it.
	 * PRIVATE   : Only this class can see it. (Use for fields!)
	 * PROTECTED : Only family (subclasses) and neighbors (package).
	 * DEFAULT   : (No keyword) Only neighbors (package) can see.

	 * THE STATIC KEYWORD
	 * ---------------------------------------------------------
	 * STATIC    : Belongs to the CLASS. Call via ClassName.method().
	 * No "new" needed. Shared memory for all objects.
	 * INSTANCE  : Belongs to the OBJECT. Needs "new" to exist.
	 * (Static methods CANNOT call instance members directly!)

	 * METHOD ANATOMY & VOID
	 * ---------------------------------------------------------
	 * VOID      : The method performs an action but returns NOTHING.
	 * RETURN    : Must return a value matching the declared type.
	 * PARAMS    : Java is ALWAYS "pass-by-value". 
	 * (No 'in', 'out', or 'ref' keywords like in C#!)
	 * Objects are passed by their reference value.
	 */
	
    private String id;
    public double balance;
    private static int userCount = 0;

    //Constructor
    public Lesson6(String id, double balance) {
        setID(id);
        this.balance = balance;
        userCount++;
    }

    public void setID(String id) {
        if (id.length() >= 8) this.id = id;
        else System.out.println("ID too short!");
    }

    public String getID() { return id; }

    public static void printSystemInfo() {
        System.out.printf("System active. Total users: %d%n", userCount);
    }

    public static void main(String[] args) {
    	
        Lesson6.printSystemInfo();

        Lesson6 player1 = new Lesson6("ABC12345", 5000.0);
        System.out.println("Player ID: " + player1.getID());

        Lesson6.printSystemInfo();
    }
}


