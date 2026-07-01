package OOP5;

public class SmartLight extends SmartDevice{

	private int brightness = 100;
	
	
	public SmartLight(String name) {
		super(name);
	}
	
	public SmartLight(String name, int brightness) {
		super(name);
		this.brightness = brightness;
	}
	
	public void setBrightness(int level) {
		if(level < 0) level = 0;
		else if(level > 100) level = 100;
		this.brightness = level;
	}
	
	public void setBrightness(double level) {
		if(level < 0) level = 0;
		else if(level > 1) level = 100;
		this.brightness = (int)(level*100);
	}
	
	public int getBrightness() {return brightness;}
	
	@Override
	public void performAction() {
		if(isOn()) System.out.printf("Light is on | brightness: %d%n",brightness);
		if(!isOn()) System.out.printf("Light is off.%n");
	}
}
