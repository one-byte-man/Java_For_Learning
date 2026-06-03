package lessons;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lesson13 {
	
	/**
	 * JAVA BIGDECIMAL
	 * ---------------------------------------------------------
	 * CONSTANTS:
	 * - BigDecimal.ZERO : Constant for value 0 (Avoids creating new objects for 0)
	 * - BigDecimal.ONE  : Constant for value 1 (Useful for increments/formulas)
	 * - BigDecimal.TEN  : Constant for value 10 (Useful for metric/decimal shifts)
	 * ---------------------------------------------------------
	 * INIT : BigDecimal val = new BigDecimal("10.50"); // String constructor is preferred
	 * VALUE: BigDecimal.valueOf(10.50);                // Safe double conversion
	 * ---------------------------------------------------------
	 * CORE METHODS:
	 * - val1.add(val2)                         : Adds val2 to val1
	 * - val1.subtract(val2)                    : Subtracts val2 from val1
	 * - val1.multiply(val2)                    : Multiplies val1 by val2
	 * - val1.divide(val2, scale, RoundingMode) : Divides val1 by val2 with specific rounding
	 * - val1.setScale(scale, RoundingMode)     : Rounds the value to specific decimal places
	 * - val1.compareTo(val2)                   : Returns 0 if equal, -1 if less, 1 if greater
	 * ---------------------------------------------------------
	 * Notes:
	 * 1. Immutability: Operations do not change the original object; they return a new BigDecimal.
	 * 2. Initialization: Avoid 'new BigDecimal(0.1)' (double), use String "0.1" to prevent precision loss.
	 * 3. Division: Always provide a RoundingMode to prevent ArithmeticException on non-terminating decimals.
	 * 4. Equality: Use .compareTo() == 0 instead of .equals() to compare numerical values ignoring scale.
	 */
	
	public static void main(String[] args) {
        System.out.println("--- BigDecimal Demonstration ---");

        // 1. INITIALIZATION (The Safe Way)
        BigDecimal playerGold = BigDecimal.valueOf(1000.00); 
        BigDecimal interestRate = new BigDecimal("0.05"); // 5% passive income
        
        // 2. MATH OPERATIONS (Must reassign because of immutability)
        // Formula: playerGold + (playerGold * interestRate)
        BigDecimal income = playerGold.multiply(interestRate);
        playerGold = playerGold.add(income); // Updating the state
        
        System.out.println("Income Generated: $" + income);
        System.out.println("Total Player Gold: $" + playerGold);

        // 3. DIVISION & ROUNDING (Avoiding the Crash)
        BigDecimal totalLoot = new BigDecimal("10.00");
        BigDecimal partyMembers = new BigDecimal("3");
        
        // DANGER: totalLoot.divide(partyMembers) -> Crash! (10/3 = 3.333...)
        // SAFE: Specify scale (2 decimals) and RoundingMode (Banker's Rounding)
        BigDecimal splitLoot = totalLoot.divide(partyMembers, 2, RoundingMode.HALF_EVEN);
        
        System.out.println("\n--- Rounding Example ---");
        System.out.println("Loot per player (10 split by 3): $" + splitLoot); // $3.33
        
        // 4. COMPARISON
        BigDecimal priceA = new BigDecimal("2.0");
        BigDecimal priceB = new BigDecimal("2.00");
        
        System.out.println("\n--- Comparison Example ---");
        System.out.println("Is 2.0 .equals() 2.00? : " + priceA.equals(priceB)); // false (checks scale/precision too)
        System.out.println("Is 2.0 .compareTo() 2.00?: " + (priceA.compareTo(priceB) == 0)); // true (checks actual mathematical value)
    }

}
