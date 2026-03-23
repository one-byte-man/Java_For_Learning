package lessons;

public class Lesson5 {

	public static void main(String[] args) {
		/**
		 * JAVA LOOPS: FOR, WHILE, DO-WHILE  
		 * ---------------------------------------------------------
		 * FOR      : Best when the number of iterations is KNOWN.
		 * Structure: for(initialization; condition; update)
		 * * WHILE    : Best when the number of iterations is UNKNOWN.
		 * Checks the condition BEFORE executing the block.
		 * * DO-WHILE : Similar to while, but executes the block AT LEAST ONCE.
		 * Checks the condition AFTER executing the block.
		 * ---------------------------------------------------------
		 * Keywords:
		 * - break    : Exits the loop immediately.
		 * - continue : Skips the current iteration and moves to the next.
		 */

		
		// FOR
		// ---------------------------------------------------
		System.out.println("FOR");
		
		for (int i = 0; i < 5; i++) {
		    System.out.println("Number: " + i);
		}
		System.out.println("*************************");

		// WHILE
		// ---------------------------------------------------
		System.out.println("WHILE");
		
		int i = 0;
		while(i < 5) {
			System.out.println("Number: " + i);
			i++;
		}
		
		System.out.println("*************************");
		
		// DO WHILE
		// ---------------------------------------------------
		System.out.println("DO WHILE");
		
		int k = 0;
		do {
			System.out.println("Number: " + k);
			k++;
		}while(k < 5);
		
		System.out.println("*************************");
		// EXERCISES
		// ---------------------------------------------------
		System.out.println("EXERCISES");
		
		int NUM = 11;
		for (int j = NUM; j > 0; j--) {
			for(int l = NUM - j; l > 0; l--) {
				System.out.print(" ");
			}
			for(int l = j; l > 0; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int j = NUM; j > 0; j--) {
			for(int l = j; l > 0; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int j = NUM; j > 0; j-=2) {
			for(int l = (NUM - j)/2; l > 0; l--) {
				System.out.print(" ");
			}
			for(int l = j; l > 0; l--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int j = NUM; j > 0; j-=2) {
			for(int l = (NUM - j)/2; l > 0; l--) {
				System.out.print("*");
			}
			for(int l = j; l > 0; l--) {
				System.out.print(" ");
			}
			for(int l = 11; l > j; l-=2) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int j = NUM; j > 0; j-=2) {
			for(int l = j/2; l > 0; l--) {
				System.out.print(" ");
			}
			for(int l = (NUM-j)+1; l > 0; l--) {
				System.out.print("*");
			}
			System.out.println();
		}

		
	}
}
