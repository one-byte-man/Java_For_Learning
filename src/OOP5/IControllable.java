package OOP5;

public interface IControllable {
	
	/**
	 * JAVA ADVANCED OOP (QUICK REF)
	 * ---------------------------------------------------------
	 * PRIVATE CONSTRUCTORS:
	 * - Syntax: private ClassName() { ... }
	 * - Why   : Prevents instantiation from outside the class.
	 * - Uses  : Utility classes (Math) or the Singleton Design Pattern.
	 * ---------------------------------------------------------
	 * JAVA 8 INTERFACE ENHANCEMENTS:
	 * - default methods : public default void doSomething() { ... }
	 * -> Has a body. Prevents breaking existing classes when adding new methods.
	 * - static methods  : public static void helper() { ... }
	 * -> Called via InterfaceName.helper(). Used for interface-specific utility logic.
	 */
	
	
	public boolean isOn();
	public void turnOn();
	public void turnOff();
	
	default void reboot() {
        System.out.println("The device is restarting with default settings...");
        turnOff();
        turnOn();
    }
	
	static boolean checkPowerGrid() {
        return true;
    }
}
