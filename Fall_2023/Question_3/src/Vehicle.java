class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("[Vehicle] The vehicle is starting.");
    }

    public void stop() {
        System.out.println("[Vehicle] The vehicle is stopping.");
    }

    public void drive() {
        System.out.println("[Vehicle] The vehicle is moving.");
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void drive() {
        super.drive();
        System.out.println("[Car] The car is moving.");
    }

    public void honk() {
        System.out.println("[Car] Honk! Honk!");
    }
}