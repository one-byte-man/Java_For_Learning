package OOP5;

public class SmartHomeTest {

    public static void main(String[] args) {
        
        // 1. POLYMORPHISM: Abstract reference array holding Concrete objects
        SmartDevice[] myHome = new SmartDevice[3];
        myHome[0] = new SmartLight("Living Room Light", 80);
        myHome[1] = new SmartCamera("Garden Camera", 2.5);
        myHome[2] = new SmartLight("Bedroom Light", 30);

        System.out.println("=== Smart Home System Initialized ===\n");

        // 2. POLYMORPHIC PROCESSING
        for (SmartDevice device : myHome) {
            
            // Turn on all devices using the IControllable interface method
            device.turnOn();
            
            // 3. DOWNCASTING: Accessing specific methods of SmartCamera
            if (device instanceof SmartCamera) {
                SmartCamera cam = (SmartCamera) device; 
                cam.startRecord(); // Triggers the newly added method
            }
            
            // DOWNCASTING: Accessing specific methods of SmartLight
            if (device instanceof SmartLight) {
                SmartLight light = (SmartLight) device;
                if (light.getBrightness() > 50) {
                    System.out.println("Warning: " + light.getDeviceName() + " is too bright. Consider energy saving.");
                }
            }

            // 4. DYNAMIC BINDING: Executes the overridden performAction() based on the actual object type
            device.performAction();
            System.out.println("----------------------------------");
        }
        
        // 5. TESTING STATE CHANGE (stopRecord)
        System.out.println("\n=== Event: Motion Stopped in Garden ===");
        if (myHome[1] instanceof SmartCamera) {
            SmartCamera cam = (SmartCamera) myHome[1];
            cam.stopRecord();
            cam.performAction(); // Verify the state changed to "not recording"
        }
    }
}