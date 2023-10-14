package Test01;
// Create a Motorcycle class that implements the Vehicle interface
public class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }

    @Override
    public int getFuelCapacity() {
        return 20; // Motorcycle-specific fuel capacity
    }

    // Optionally override the default honk method
    @Override
    public String honk() {
        return "Motorcycle honking: Vroom!";
    }
}