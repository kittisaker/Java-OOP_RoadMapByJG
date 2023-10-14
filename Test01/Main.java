package Test01;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
        System.out.println("Car's fuel capacity: " + car.getFuelCapacity());
        System.out.println("Car honk: " + car.honk());

        Vehicle boat = new Boat();
        boat.start();
        boat.stop();
        System.out.println("Boat's fuel capacity: " + boat.getFuelCapacity());
        System.out.println("Boat honk: " + boat.honk());

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.stop();
        System.out.println("Motorcycle's fuel capacity: " + motorcycle.getFuelCapacity());
        System.out.println("Motorcycle honk: " + motorcycle.honk());
        
        // Accessing the default honk method from the interface itself
        Vehicle defaultVehicle = new Vehicle() {

            @Override
            public void start() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'start'");
            }

            @Override
            public void stop() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'stop'");
            }

            @Override
            public int getFuelCapacity() {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'getFuelCapacity'");
            }
            // Anonymous class implementing Vehicle with no additional methods
        };
        System.out.println("Default honk: " + defaultVehicle.honk());
    }
}