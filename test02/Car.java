package test02;

class Car implements Vehicle, Alarm {
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

    @Override
    public boolean isAlarmOn() {
        return false; // Car-specific alarm status
    }

    // Optionally override the default honk method
    @Override
    public String honk() {
        return "Car honking: Beep beep!";
    }
}

