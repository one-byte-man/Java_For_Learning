package lessons;
import java.security.SecureRandom;
import java.util.Arrays;

public class Lesson9 {
	
	// Değiştirilemez sabit tanımlama
    private static final int SIMULATION_COUNT = 50;
    private static final int MAX_SCORE = 100;

	public static void main(String[] args) {
		/**
		 * JAVA KEYWORDS & EXCEPTIONS 
		 * ---------------------------------------------------------
		 * final (VAR) : final int X = 10; // Value cannot be changed
		 * toString()  : e.toString()      // Exception name + message
		 * ---------------------------------------------------------
		 * Notes:
		 * 1. final Reference: Array/Object address is fixed, but contents can change.
		 * 2. Exception Info: toString() provides the exact exception class and details.
		 
		 **********************************************************
		 * MULTI-DIMENSIONAL ARRAYS
		 * ---------------------------------------------------------
		 * MATRIX : int[][] mat = new int[3][4];     // 3 rows, 4 columns
		 * JAGGED : int[][] jag = {{1, 2}, {3, 4, 5}}; // Varying row lengths
		 * PRINT  : Arrays.deepToString(mat)         // Prints all dimensions
		 * ---------------------------------------------------------
		 * Notes:
		 * 1. Structure: Rows are actual arrays holding references to column arrays.
		 
		 **********************************************************
		 * ENHANCED FOR LOOP
		 * ---------------------------------------------------------
		 * SYNTAX : for (Type element : arrayOrCollection) { ... }
		 * MEANING: "for each element IN array"
		 * ---------------------------------------------------------
		 * Notes:
		 * 1. Read-Only: Modifying 'element' inside loop does not change the array data.
		 * 2. Indexless: Cannot access the current index directly during the loop.

		 * VARIABLE-LENGTH ARGUMENTS - VARARGS
		 * ---------------------------------------------------------
		 * SYNTAX : void method(int... numbers) { ... } // Zero or more ints
		 * BEHIND : Treated inside the method as a standard array (numbers[0])
		 * ---------------------------------------------------------
		 * Notes:
		 * 1. Position: Must be the absolute last parameter in the method signature.
		 * 2. Limit: A method can have only one varargs parameter.
		 */

		/**
		 * JAVA ARRAYS CLASS & UTILITIES 
		 * ---------------------------------------------------------
		 * SORT   : Arrays.sort(arr,int fromIndex, int toIndex)    	// Ascending order
		 * SEARCH : Arrays.binarySearch(a,x)						// Returns index (Requires sorted array)
		 * EQUALS : Arrays.equals(arrA,arrB)						// Compares elements, not addresses
		 * FILL   : Arrays.fill(arr, val)   						// Fills array with a single value
		 * COPY   : System.arraycopy(src, srcPos, dest, destPos, len) // Fast copy
		 * ---------------------------------------------------------
		 * Notes:
		 * 1. Search Failure: binarySearch on an unsorted array returns unpredictable data.
		 * 2. Native Copy: System.arraycopy uses direct memory copy for high performance.
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
		// ------------------------------------------

        System.out.println("=== 1. ENHANCED FOR LOOP & DATA GENERATION ===");
        int[] rawScores = new int[SIMULATION_COUNT];
        for (int i = 0; i < rawScores.length; i++) {
            rawScores[i] = sr.nextInt(MAX_SCORE + 1);
        }

        System.out.print("Generated Raw Scores: ");
        // Enhanced for loop: Read-only traversal without indices
        for (int score : rawScores) {
            System.out.print(score + " ");
        }
        System.out.println("\n");


        System.out.println("=== 2. java.util.Arrays UTILITIES ===");
        
        int[] testFill = new int[5];
        Arrays.fill(testFill, -1); // Fills the entire array with -1
        System.out.println("Arrays.fill(-1) Result: " + Arrays.toString(testFill));
        
        Arrays.sort(rawScores); // Sorts elements in ascending order
        System.out.println("Arrays.sort() Result (Sorted): " + Arrays.toString(rawScores));

        int targetScore = 50;
        int searchResult = Arrays.binarySearch(rawScores, targetScore); // Requires a sorted array
        System.out.println("Arrays.binarySearch(" + targetScore + ") Result (Index): " + searchResult);

        int[] exactCopySample = new int[SIMULATION_COUNT];
        System.arraycopy(rawScores, 0, exactCopySample, 0, SIMULATION_COUNT);
        boolean isIdentical = Arrays.equals(rawScores, exactCopySample); // Compares element values, not references
        System.out.println("Arrays.equals() Content Comparison: " + isIdentical + "\n");


        System.out.println("=== 3. System.arraycopy (HIGH PERFORMANCE COPY) ===");
        int[] criticalScores = new int[10]; 
        
        // Copies first 5 elements (lowest) to the beginning of target array
        System.arraycopy(rawScores, 0, criticalScores, 0, 5);
        
        // Copies last 5 elements (highest) to the end of target array
        System.arraycopy(rawScores, rawScores.length - 5, criticalScores, 5, 5);
        
        System.out.println("Critical Scores Array (First 5 Lowest, Last 5 Highest):");
        System.out.println(Arrays.toString(criticalScores) + "\n");


        System.out.println("=== 4. MULTI-DIMENSIONAL & JAGGED ARRAYS ===");
        // Jagged array: An array of arrays with varying row lengths
        int[][] performanceGroups = new int[3][];
        performanceGroups[0] = new int[2]; 
        performanceGroups[1] = new int[3]; 
        performanceGroups[2] = new int[4]; 

        for (int row = 0; row < performanceGroups.length; row++) {
            for (int col = 0; col < performanceGroups[row].length; col++) {
                performanceGroups[row][col] = sr.nextInt(MAX_SCORE + 1);
            }
        }
        System.out.println("Jagged Array Structure: " + Arrays.deepToString(performanceGroups) + "\n");


        System.out.println("=== 5. VARIABLE-LENGTH ARGUMENT LISTS (VARARGS) ===");
        // The method accepts either comma-separated values or a direct array reference
        int avg1 = calculateAverage(70, 80, 90);
        int avg2 = calculateAverage(rawScores); 
        
        System.out.println("Varargs Manual Input Average (70, 80, 90): " + avg1);
        System.out.println("Varargs Array Input Average (All Raw Scores): " + avg2 + "\n");


        System.out.println("=== 6. EXCEPTION toString() ANALYSIS ===");
        try {
            int invalidAccess = rawScores[SIMULATION_COUNT + 10];
        } catch (ArrayIndexOutOfBoundsException e) {
            // toString() returns both the Exception class name and the error description
            System.out.println("Exception e.toString() Output: " + e.toString());
        }
    }

    // Varargs parameter must be the absolute last argument in the method signature
    public static int calculateAverage(int... numbers) {
        if (numbers.length == 0) return 0;
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

}
