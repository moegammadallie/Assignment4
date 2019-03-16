package za.ac.cput.Projects;
/*
- ElectricPowerSwitch class with a field referencing LightBulb
- The high-level ElectricPowerSwitch class is directly dependent on the low-level LightBulb
 */
public class ElectricPowerSwitch implements Switch
{
    public Switchable client;
    public boolean on;

    public ElectricPowerSwitch(Switchable client)
    {
        this.client = client;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }
    public void press() {
        boolean checkOn = isOn();
        if (checkOn)
        {
            client.turnOff();
            this.on = false;
        } else {
            client.turnOn();
            this.on = true;
        }

    }
}
