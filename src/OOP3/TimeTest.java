package OOP3;

public class TimeTest {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		Time t2 = new Time(18);
		Time t3 = new Time(10,25);
		Time t4 = new Time(10,25,48);
		Time t5 = new Time(t4);
		
		Time[] times = {t1,t2,t3,t4,t5};
		
		for(Time t:times) {
			displayTime(t);
		}
		
		try {
			Time t6 = new Time(12,90,61);
		}
		catch(IllegalArgumentException e){
			System.out.printf("%nException while initializing t6: %s%n",e.getMessage());
		}


	}

	
	public static void displayTime(Time time) {
		System.out.printf("%s%n%s%n",time.toUniversalString(),time.toString());
	

	}
}