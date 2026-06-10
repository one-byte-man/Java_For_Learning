package OOP5;

public class SmartHomeHub {
	
	private static SmartHomeHub instance = new SmartHomeHub();
	
	//PRIVATE CONSTRUCTOR: Prevents 'new SmartHomeHub()' from outside
	private SmartHomeHub() {
		System.out.println("Smart Home Hub Initialized (Singleton - Only happens once)");
	}
	
	public static SmartHomeHub getInstance() {
		return instance;
	}
	
	public void runDiagnostics(SmartDevice[] devices) {
		System.out.println("\n--- Hub: Running System Diagnostics (Rebooting all) ---");
		for(SmartDevice device : devices) {
			System.out.print(device.getDeviceName() + " -> ");
			device.reboot();
		}
	}
}
