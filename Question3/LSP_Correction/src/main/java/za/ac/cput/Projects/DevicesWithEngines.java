package za.ac.cput.Projects;

public class DevicesWithEngines extends TransportationDevice {
    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startEngine(){
        System.out.println("Engine starts!!!");
    }
}
