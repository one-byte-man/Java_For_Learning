package OOP5;

/**
 * JAVA POLYMORPHISM & INTERFACES (QUICK REF)
 * ---------------------------------------------------------
 * WHAT : Building extensible systems using "programming in the general".
 * WHY  : Allows processing objects of various classes through the same superclass/interface reference.
 * ---------------------------------------------------------
 * INIT : 
 * - Interface: public interface IMovable { void move(); }
 * - Abstract : public abstract class Unit { public abstract void attack(); }
 * - Concrete : public class Cavalry extends Unit implements IMovable { ... }
 * ---------------------------------------------------------
 * POLYMORPHIC BEHAVIOR:
 * - Upcasting   : Unit myUnit = new Cavalry(); // Superclass ref holding subclass object
 * - instanceof  : if (myUnit instanceof Cavalry) { ... } // Type checking at runtime
 * - Downcasting : Cavalry c = (Cavalry) myUnit; // Forcing superclass ref to subclass ref
 * ---------------------------------------------------------
 * Notes & Gotchas (Critical Errors):
 * 1. Instantiation : You CANNOT instantiate abstract classes or interfaces (e.g., new Unit() -> Error).
 * 2. Multiplicity  : A class can 'extend' only ONE class, but can 'implement' MULTIPLE interfaces.
 * 3. Cast Crash    : ALWAYS use 'instanceof' before downcasting. Otherwise, it may throw ClassCastException.
 * 4. Visibility    : When implementing an interface, overridden methods MUST be declared as 'public'.
 * 5. Method Bodies : Abstract methods and interface methods (traditionally) have NO body (no curly braces {}).
 */


public abstract class SmartDevice implements IControllable {
	
	private String deviceName;
	private boolean status = false;
	
	public SmartDevice(String name) {
		this.deviceName = name;
	}
	
	@Override
	public void turnOn() {
		status = true;
	}
	
	@Override
	public void turnOff() {
		status = false;
	}
	
	@Override
	public boolean isOn() {
		return status;
	}
	
	public abstract void performAction();
	
	public String getDeviceName() {return deviceName;}
	
}
