package lessons;
import java.security.SecureRandom;

public class Lesson9 {

	public static void main(String[] args) {
		/**
		 * JAVA ARRAYS (QUICK REF)  
		 * ---------------------------------------------------------
		 * INIT : int[] arr = new int[5]; // Fixed size
		 * LIT  : int[] arr = {1, 2, 3};  // Shorthand
		 * SIZE : arr.length              // Constant field
		 * ---------------------------------------------------------
		 * Notes:
		 * 1. Fixed Size: Cannot resize after creation.
		 * 2. Bounds: Accessing index < 0 or >= length throws Exception.
		 * 3. Default: int is 0, boolean is false, Object is null.
		 * 4. Reference: 'arrA = arrB' copies address, not data.
		 * 5. Printing: 'System.out.println(arr)' prints memory hash.
		 */
		
		// Grade System
		SecureRandom sr = new SecureRandom();
		int[] rangePoints = {0,10,20,30,40,50,60,70,80,90,100};
		int[] gradeCounter = new int[11];
		
		
		for (int i = 1;i <= 1000; i++) {
			int num = sr.nextInt(101);
			
			for (int n = 0; n < 10; n++) {
				if(num >= rangePoints[n] && num < rangePoints[n+1]) {
					gradeCounter[n]++;
				}
				if(n+1 == 10 && num == rangePoints[n+1]) {
					gradeCounter[n+1]++;
				}
			}
		}

		for(int i = 0; i < rangePoints.length - 1; i++) {
			System.out.printf("%2d - %2d: %3d\n", rangePoints[i],( rangePoints[i+1] - 1) , gradeCounter[i]);
			if (i + 1 == 10) System.out.printf("%7d: %3d\n",rangePoints[i+1], gradeCounter[i+1]);
		}
		
		// Graphic
		System.out.println();
		for(int i = 0; i < rangePoints.length - 1; i++) {
			System.out.printf("%2d - %2d:", rangePoints[i],( rangePoints[i+1] - 1));
			int num = gradeCounter[i] / 10;
			for(int c = num; c > 0; c--) {
				System.out.print("*");
			}
			System.out.println();
			
			
			if (i + 1 == 10) {
				System.out.printf("%7d:",rangePoints[i+1]);
				num = gradeCounter[i+1] / 10;
				for(int c = num; c > 0; c--) {
					System.out.print("*");
				}
				System.out.println();
			}

		}

	}
}
