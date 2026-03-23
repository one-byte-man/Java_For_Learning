package lessons;

public class Lesson7 {

	public static void main(String[] args) {
		/**
		 * CHAR & NUMBER MAPPING (UNICODE / ASCII)
		 * ---------------------------------------------------------
		 * - Uppercase Letters (A-Z) : 65 - 90
		 * - Lowercase Letters (a-z) : 97 - 122
		 * - Digits as Chars ('0'-'9'): 48 - 57
		 * ---------------------------------------------------------
		 * KEY CONVERSIONS:
		 * - char to int : int code = (int) 'A';
		 * - int to char : char letter = (char) 66;
		 * ---------------------------------------------------------
		 * MATH OPERATIONS:
		 * - 'A' + 32 -> 97 (Convert to lowercase logic)
		 * - '5' - '0' -> 5 (Convert char digit to actual int)
		 * ! char is 16-bit unsigned (0 to 65535)
		 */
		// LowerCase
		for (char letter = 'a'; letter <= 'z';letter++) {
			System.out.println(letter);
		}

		
		char ch = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.println(ch);
			ch += 1;
		}
		// UpperCase
		
		for (char letter = 'A'; letter <= 'Z';letter++) {
			System.out.println(letter);
		}

		ch = 'a' - 32;
		for (int i = 0; i < 26; i++) {
			System.out.println(ch);
			ch += 1;
		}
	}

}
