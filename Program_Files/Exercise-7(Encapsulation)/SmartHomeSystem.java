class SmartHome {
    private boolean lightsOn;
    private boolean doorLocked;

    public SmartHome() {
        this.lightsOn = false;
        this.doorLocked = true;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public boolean isDoorLocked() {
        return doorLocked;
    }

    public void toggleLights() {
        lightsOn = !lightsOn;
        System.out.println("Lights are now " + (lightsOn ? "ON" : "OFF"));
    }

    public void lockDoor(boolean lock) {
        doorLocked = lock;
        System.out.println("Door is now " + (doorLocked ? "LOCKED" : "UNLOCKED"));
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        SmartHome home = new SmartHome();

        home.toggleLights();
        home.lockDoor(false);
    }
}
