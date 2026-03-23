package OOP1;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Account myAccount = new Account();
		
		System.out.println("Enter your name: ");
		
		String name = input.next();
		myAccount.setName(name);
		
		System.out.printf("Your name is: %s%n",myAccount.getName());
		
		Account1 Account_1 = new Account1(); 			//Constructor 1
		Account1 Account_2 = new Account1("Ahmet");		//Constructor 2
		Account1 Account_3 = new Account1("Ahmet",20);	//Constructor 3
		
		System.out.printf("1.Your name is: %s%n",Account_1.getName());
		System.out.printf("2.Your name is: %s%n",Account_2.getName());
		System.out.printf("3.Your name is: %s%n",Account_3.getName());
		
		System.out.printf("1.Your age is: %d%n",Account_1.getAge());
		System.out.printf("2.Your age is: %d%n",Account_2.getAge());
		System.out.printf("3.Your age is: %d%n",Account_3.getAge());
		
		input.close();

	}

}
