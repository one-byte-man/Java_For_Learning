package OOP4;

public abstract class Shape {
	/**
	 * JAVA INHERITANCE: SUPERCLASSES & SUBCLASSES
	 * ---------------------------------------------------------
	 * INIT : public class SubClass extends SuperClass { ... }
	 * ---------------------------------------------------------
	 * CORE KEYWORDS & ANNOTATIONS:
	 * - extends        : Inherits the public and protected members of another class.
	 * - super(...)     : Invokes the superclass's constructor. MUST be the first statement in subclass constructor.
	 * - super.method() : Calls the superclass's version of a method.
	 * - @Override      : Compiler check to ensure a method properly overrides a superclass method.
	 * ---------------------------------------------------------
	 * Notes:
	 * 1. Single Inheritance: A class can only extend ONE direct superclass in Java.
	 * 2. Constructors  : Constructors are NEVER inherited. Subclasses must explicitly or implicitly call a superclass constructor.
	 * 3. Object Class  : If a class doesn't explicitly extend another, it implicitly extends java.lang.Object.
	 */
	
    private String shapeName; 
    
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    
    public String getShapeName() {
        return shapeName;
    }
	
}
