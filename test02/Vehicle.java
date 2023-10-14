package test02;

// Define a Vehicle interface with default methods that have return values
interface Vehicle {
    void start();
    void stop();
    int getFuelCapacity();
    
    default String honk() {
        return "Default honk sound";
    }
}