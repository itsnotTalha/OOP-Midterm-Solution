class Myobject {
    private double r;

    public double findVolume() {
        return -1.0;
    }

    public double getR() {
        return r;
    }

    public Myobject(double r) {
        this.r = r;
    }
}

class Sphere extends Myobject {
    public double findVolume() {
        return 4 / 3 * Math.PI * Math.pow(getR(), 3);
    }

    public Sphere(double r) {
        super(r);
    }
}

class Cylinder extends Myobject {
    private double h;

    public Cylinder(double r, double h) {
        super(r);
        this.h = h;

    }

    public double findVolume() {
        return Math.PI * Math.pow(super.getR(), 2) * h;
    }

    public double getH() {
        return h;
    }
}

class Cone extends Myobject {
    private double h;

    public Cone(double r, double h) {
        super(r);
        this.h = h;
    }

    public double findVolume() {
        return 1 / 3 * Math.PI * Math.pow(getR(), 2) * h;
    }

    public double getH() {
        return h;
    }
}