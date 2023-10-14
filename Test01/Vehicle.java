package Test01;
// Define a Vehicle interface with default methods that have return values
public interface Vehicle {
    void start();

    void stop();

    int getFuelCapacity(); // Default method with a return value

    default String honk() {
        return "Default honk sound";
    }
}