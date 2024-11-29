class Ride {
    //private instance that can not be changed
    private static final int speedLimit = 80;
    //normal instances
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
            //returning total fine
            return basefine + extrafine * extraHour;
        } else
            return 0;
    }
}

class Bike extends Ride {
    public Bike() {
        //directly calling super class with argument value
        super(20, 2, 50, 100);
    }
}

class Car extends Ride {
    public Car() {
        super(40, 10, 100, 150);
    }
}

class Microbus extends Ride {
    public Microbus() {
        super(15, 5, 3000, 0);
    }
}
