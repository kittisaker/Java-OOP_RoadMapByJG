package Test01;
// Create a Boat class that implements the Vehicle interface
public class Boat implements Vehicle {
    @Override
    public void start() {
        System.out.println("Boat started");
    }

    @Override
    public void stop() {
        System.out.println("Boat stopped");
    }

    @Override
    public int getFuelCapacity() {
        return 200; // Boat-specific fuel capacity
    }

    // Boat doesn't provide an explicit implementation for the default honk method
}