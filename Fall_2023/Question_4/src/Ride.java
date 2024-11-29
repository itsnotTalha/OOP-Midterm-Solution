class Ride {
    private static final int speedLimit = 80;
    double initialSpeed;
    double acceleration;
    double basefine;
    double extrafine;

    public Ride(int initialSpeed, double acceleration, double basefine, double extrafine) {
        this.initialSpeed = initialSpeed;
        this.acceleration = acceleration;
        this.basefine = basefine;
        this.extrafine = extrafine;
    }

    public double getHighestAccelerationTime() {
        /*
        v = u + at
        v - u = at
        t = (v - u)/a
         */
        return (speedLimit - initialSpeed) / acceleration;
    }

    double calculateFine(int hour) {
        if (hour >= getHighestAccelerationTime()) {
            double extraHour = Math.floor(hour - getHighestAccelerationTime());
            return basefine + extrafine * extraHour;
        } else
            return 0;
    }

    public static int getspeedLimit(int a) {
        return speedLimit;
    }

}

class Bike extends Ride {
    public Bike(){
 super(20,2,50,100);
    }
}

class Car extends Ride {
public Car(){
    super(40, 10, 100, 150);
}
}

class Microbus extends Ride {
public Microbus(){
    super(15, 5, 3000, 0);
}
}
