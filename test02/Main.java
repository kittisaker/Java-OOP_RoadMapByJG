package test02;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        System.out.println("Car's fuel capacity: " + car.getFuelCapacity());
        System.out.println("Car honk: " + car.honk());
        System.out.println("Car alarm status: " + car.isAlarmOn());
    }
}