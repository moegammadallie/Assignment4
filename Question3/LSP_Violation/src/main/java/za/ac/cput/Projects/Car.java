package za.ac.cput.Projects;
/*
<<<Liskov Substitution Principle violation>>>
-Yes, a bicycle is a transportation device, however, it does not have an engine and hence,
the method startEngine() cannot be implemented.
 */
public class Car extends TrasportationDevice {
    public void startEngine(){
        System.out.println("Car starts!!");
    }
}
