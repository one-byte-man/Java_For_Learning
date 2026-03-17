
public class Lesson1 {

	public static void main(String[] args) {
		/*
		// VARIABLES  
		// Java Primitive Data Types
		// =========================
		// | Data Type | Size    | Minimum Value      | Maximum Value      | Wrapper Class | Default Value |
		// |-----------|---------|--------------------|--------------------|---------------|---------------|
		// | char      | 16 bit  | Unicode 0          | Unicode 2^16-1     | Character     | '\u0000'      |
		// | long      | 64 bit  | -2^63              | 2^63-1             | Long          | 0L            |
		// | int       | 32 bit  | -2^31              | 2^31-1             | Integer       | 0             |
		// | short     | 16 bit  | -2^15              | 2^15-1             | Short         | 0             |
		// | byte      | 8 bit   | -2^7               | 2^7-1              | Byte          | 0             |
		// | double    | 64 bit  | -1.7*10^308        | 1.7*10^308         | Double        | 0.0d          |
		// | float     | 32 bit  | -3.4*10^38         | 3.4*10^38          | Float         | 0.0f          |
		// | boolean   | 1 bit   | false              | true               | Boolean       | false         |
		// Not: char tipi unsigned'dır ve 0 ile 65535 arasında değer alır.
		// Not: float ve double için verilen değerler yaklaşık değerlerdir.
		// Not: boolean'ın boyutu JVM implementasyonuna bağlıdır, genellikle 1 bit olarak kabul edilir.
		// String is Non-Primitive Type, it is a referance type. so writed with uppercase S.
		*/
		
		int x = 10;
		long a = 100_000_000; // Numbers can be made more legible with "_"
		short b = 200;
		byte c = 12;
		double y = 0.002;
		float z = 10.2f;
		
		double sum  = x + y + z;
		System.out.println("SUM: "+sum);
		System.out.println(a+b+c);
		
		char ch1 = 'A';
		char ch2 = 'h';
		char ch3 = 'm';
		char ch4 = 'e';
		char ch5 = 't';
		
		boolean isAhmet = true;
		
		System.out.println("Is he "+ch1+ch2+ch3+ch4+ch5+ " : " + isAhmet);
		
		String name = "Ahmet"; // String is reference type
		
		System.out.println(name);
	}

}
