package OOP5;

public class SmartCamera extends SmartDevice{
	
	private boolean isRecording = false;
	private double zoom = 1.0; // 0.1 - 10.0
	
	public SmartCamera(String name) {
		super(name);
	}
	
	public SmartCamera(String name, double zoom) {
		super(name);
		this.zoom = zoom;
	}
	
	public void setZoom(double level) {
		if(level < 0.1f) level = 0.1f;
		else if(level > 10.0f) level = 10.0f;
		this.zoom = level;
	}
	
	public double getZoom() {return zoom;}
	
	public void startRecord() {
	    isRecording = true;
	    System.out.println("Motion detected! " + getDeviceName() + " is recording!");
	}
	
	public void stopRecord() {
	    isRecording = false;
	    System.out.println("Motion detected! " + getDeviceName() + " recording stopped!");
	}
	
	public boolean isCameraRecording() {
		return isRecording;
	}
	
	@Override
	public void performAction() {
		if(isOn() && isRecording) System.out.printf("Camera is on and it is recording | zoom: %.1f%n",zoom);
		else if(isOn() && !isRecording) System.out.printf("Camera is on but it is not recording | zoom: %.1f%n",zoom);
		else if(!isOn()) System.out.printf("Camera is off.%n");
	}
	
}
