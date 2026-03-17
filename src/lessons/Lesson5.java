package lessons;
import java.util.Scanner;

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
		
		Scanner input = new Scanner(System.in);
		
		
		// ---------------------------------------------------
		// FOR
		
		for (int i = 0; i < 5; i++) {
		    System.out.println("Number: " + i);
		}
		
		// ---------------------------------------------------
		// While
		
		System.out.println("Enter grade ('-1' Exiting):");
		int grade = input.nextInt();
		int totalGrade = 0;
		int grades = 0;
		
		while (grade != -1) {
			totalGrade += grade;
			grades += 1;
			
			System.out.println("Enter grade ('-1' Exiting):");
			grade = input.nextInt();
		}
		
		float average = totalGrade/grades;
		System.out.printf("Total grades: %d%n", totalGrade);
		System.out.printf("Number of grades: %d%n", grades);
		System.out.printf("Average grade: %.2f%n", average);
	}

}
