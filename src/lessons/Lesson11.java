package lessons;
import java.util.ArrayList;

public class Lesson11 {

	public static void main(String[] args) {
		/**
		 * JAVA COLLECTIONS: ARRAYLIST
		 * ---------------------------------------------------------
		 * INIT : ArrayList<Type> list = new ArrayList<>(); // Diamond notation
		 * SIZE : list.size()                               // Dynamic element count
		 * ---------------------------------------------------------
		 * CORE METHODS:
		 * - list.add(element)       : Adds to the end of the ArrayList
		 * - list.add(index, element): Inserts element at the specified index
		 * - list.get(index)         : Returns the element at that index
		 * - list.remove(index/obj)  : Removes by index or by the first object match
		 * - list.indexOf(element)   : Returns index of first occurrence, or -1
		 * - list.contains(element)  : Returns true if element exists in list
		 * - list.clear()            : Removes all elements from the list
		 * - list.trimToSize()       : Trims capacity to match current element size
		 * ---------------------------------------------------------
		 * Notes:
		 * 1. Resizable: Unlike standard arrays, ArrayList grows and shrinks dynamically.
		 * 2. Primitives: Cannot hold primitive types directly (use Integer, Double instead).
		 * 3. Type Safety: Diamond notation (<>) enforces compile-time type checking.
		 */
		
		
		ArrayList<Integer> nums = new ArrayList();
		
		for(int i = 1; i<=15; i++) {
			nums.add(i);
		}
		
		Print(nums.get(0));
		Print(nums.indexOf(10));
		System.out.println(nums.contains(1));
		
		System.out.println("----------remove----------");
		nums.remove(5); //number 6 will missing
		for(int n:nums) {
			Print(n);
		}
		System.out.println("---------clear-----------");
		nums.clear();
		for(int n:nums) {
			Print(n);
		}
		
		
	}
	
	
	public static void Print(double d) {
		System.out.printf("NUMBER: %.2f\n",d);
	}

}
