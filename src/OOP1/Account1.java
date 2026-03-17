package OOP1;

public class Account1 {
	
	String name;
	int age;
	
	//Constructor 1
	public Account1() {}
	
	//Constructor 2
	public Account1(String name) {
		this.name = name;
	}
	
	//Constructor 3
	public Account1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
