package lessons;

public class Lesson2 {

	public static void main(String[] args) {
		/**
		 * | Category          | Operator | Description                  | Example (a=10, b=20) |
		 * |-------------------|----------|------------------------------|----------------------|
		 * | Arithmetic        | +        | Addition                     | a + b = 30           |
		 * |                   | -        | Subtraction                  | a - b = -10          |
		 * |                   | * | Multiplication               | a * b = 200          |
		 * |                   | /        | Division                     | b / a = 2            |
		 * |                   | %        | Modulus (Remainder)          | b % a = 0            |
		 * |                   | ++       | Increment                    | a++ (a becomes 11)   |
		 * |                   | --       | Decrement                    | a-- (a becomes 9)    |
		 * |-------------------|----------|------------------------------|----------------------|
		 * | Assignment        | =        | Assign                       | a = b (a becomes 20) |
		 * |                   | +=       | Add and Assign               | a += 5 (a = 15)      |
		 * |                   | -=       | Subtract and Assign          | a -= 3 (a = 7)       |
		 * |                   | *=       | Multiply and Assign          | a *= 2 (a = 20)      |
		 * |                   | /=       | Divide and Assign            | a /= 2 (a = 5)       |
		 * |-------------------|----------|------------------------------|----------------------|
		 * | Comparison        | ==       | Equal to                     | a == b (false)       |
		 * |                   | !=       | Not equal to                 | a != b (true)        |
		 * |                   | >        | Greater than                 | a > b (false)        |
		 * |                   | <        | Less than                    | a < b (true)         |
		 * |                   | >=       | Greater than or equal to     | a >= 10 (true)       |
		 * |                   | <=       | Less than or equal to        | b <= 20 (true)       |
		 * |-------------------|----------|------------------------------|----------------------|
		 * | Logical           | &&       | Conditional AND (Short-ckit) | (a < b && b > 15) T  |
		 * | (Conditional)     | ||       | Conditional OR (Short-ckit)  | (a > b || a == 10) T |
		 * |                   | !        | Logical Negation (NOT)       | !(a < b) F           |
		 * |-------------------|----------|------------------------------|----------------------|
		 * | Boolean Logical   | &        | Boolean Logical AND          | (true & false) F     |
		 * | (Full Evaluation) | |        | Boolean Logical Inclusive OR | (true | false) T     |
		 * |                   | ^        | Boolean Logical Exclusive OR | (true ^ true) F      |
		 * * Notes:
		 * 1. The '+' operator is also used for string concatenation: "Ahmet" + 100 = "Ahmet100"
		 * 2. Short-Circuit (&&, ||): If the first operand determines the result, the second is not evaluated.
		 * 3. Boolean (&, |): Always evaluates both operands (also used for bitwise operations).
		 * 4. XOR (^): Returns 'true' only if the operands are different.
		 */
		
		int a = 50;
		int b = 10;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		a++; // Use the data first, then increment it by 1. a = 51
		b--; // Use the data first, then decrease it by 1. 	b = 9
		
		System.out.println("a:"+a++); 	// a = 52
		System.out.println("b:"+b--); 	// b = 8
		
		System.out.println("a:"+a+" b:"+b);
		
		--a; // Decrease by 1 first, then use it a = 51
		++b; // Increase by 1 first, then use it b = 9
		
		System.out.println("a:"+ --a); 	// a = 50
		System.out.println("b:"+ ++b); 	// b = 10
		
		float x = 10.0f;
		float y = 0.5f;
		float z = 2.5f;
		
		x += y;	// x = 10.5
		System.out.println("x:"+ x);
		x -= z;	// x = 10.5-2.5 = 8
		System.out.println("x:"+ x);
		x /= 2; // x = 8 / 2 = 4
		System.out.println("x:"+ x);
		x *= 5; // x = 4 * 5 = 20
		System.out.println("x:"+ x);
		
		System.out.println(10 > 5);	// T
		System.out.println(10 < 5);	// F
		System.out.println(10 >= 5);// T
		System.out.println(10 <= 5);// F
		System.out.println(10 != 5);// T
		System.out.println(10 == 5);// F

		// Logical AND (&&) - Returns true only if both operands are true
		System.out.println(true && true);   // true
		System.out.println(true && false);  // false
		System.out.println(false && true);  // false
		System.out.println(false && false); // false

		// Logical OR (||) - Returns true if at least one operand is true
		System.out.println(true || true);   // true
		System.out.println(true || false);  // true
		System.out.println(false || true);  // true
		System.out.println(false || false); // false

		// Logical NOT (!) - Reverses the result (true to false, false to true)
		System.out.println(!true);          // false
		System.out.println(!false);         // true
		
		int num = 10;
		System.out.println((num >= 10) && (10 - 5) < 10); // T
		
		// Boolean Logical Operators
		int num2 = 5;
		
		if(num2 > 10 && ++num2 > 10) {}	//The second condition does not run. num2 is still 5
		System.out.println(num2);
		if(num2 > 10 & ++num2 > 10) {}	//The second condition runs. num2 will be 6
		System.out.println(num2);
		
		
		
	}

}
