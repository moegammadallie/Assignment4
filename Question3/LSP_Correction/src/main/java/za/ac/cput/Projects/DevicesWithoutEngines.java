package za.ac.cput.Projects;

/*
We can extend TransportationDevice for non-motorized devices
 */
public class DevicesWithoutEngines extends TransportationDevice {
    void startMoving() {
        System.out.println("Starts moving!!");
    }
}
