package OOP1;

public class Account {
	/**
	 * JAVA 'this' KEYWORD  
	 * ---------------------------------------------------------
	 * Definition: A reference variable that refers to the current object instance.
	 * Primary Use: To distinguish between class fields and local parameters 
	 * when they have the same name (Shadowing).
	 * ---------------------------------------------------------
	 */
	/**
	 * JAVA ACCESS MODIFIERS: PUBLIC vs PRIVATE 
	 * ---------------------------------------------------------
	 * PUBLIC  : The class, method, or field is accessible from ANY other class
	 * in the entire project, regardless of the package.
	 * PRIVATE : The method or field is accessible ONLY within the class 
	 * where it is defined. It is hidden from all other classes.
	 * ---------------------------------------------------------
	 */
	
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
