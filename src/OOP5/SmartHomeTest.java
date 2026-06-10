package OOP5;

public class SmartHomeTest {

    public static void main(String[] args) {
        
        // 1. INTERFACE STATIC METHOD TEST
        // We call this directly via the Interface name, without creating any object.
        boolean isPowerOn = IControllable.checkPowerGrid();
        if (!isPowerOn) {
            System.out.println("No power. System shutdown.");
            return;
        }

        // 2. PRIVATE CONSTRUCTOR / SINGLETON TEST
        // SmartHomeHub hub = new SmartHomeHub(); // This would cause a Compilation Error!
        System.out.println("\n=== Booting Hub ===");
        SmartHomeHub mainHub = SmartHomeHub.getInstance(); 
        
        // Let's call it again to prove it doesn't run the constructor twice
        SmartHomeHub sameHub = SmartHomeHub.getInstance(); 

        // 3. POLYMORPHISM
        SmartDevice[] myHome = new SmartDevice[3];
        myHome[0] = new SmartLight("Living Room Light", 80);
        myHome[1] = new SmartCamera("Garden Camera", 2.5);
        myHome[2] = new SmartLight("Bedroom Light", 30);

        mainHub.runDiagnostics(myHome);

        System.out.println("\n=== Standard Polymorphic Processing ===\n");

        for (SmartDevice device : myHome) {
            
            device.turnOn();
            
            // DOWNCASTING
            if (device instanceof SmartCamera) {
                SmartCamera cam = (SmartCamera) device; 
                cam.startRecord(); 
            }
            
            // DYNAMIC BINDING
            device.performAction();
            System.out.println("----------------------------------");
        }
    }
}