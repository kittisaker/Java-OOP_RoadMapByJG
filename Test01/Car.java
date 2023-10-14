package Test01;
// Create a Car class that implements the Vehicle interface
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public int getFuelCapacity() {
        return 50; // Car-specific fuel capacity
    }

    // Optionally override the default honk method
    @Override
    public String honk() {
        return "Car honking: Beep beep!";
    }
}