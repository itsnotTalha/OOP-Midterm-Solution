public class Logarithm {
    double x;
    int b;

    public Logarithm(int b, double x) {
        this.b = b;
        this.x = x;
    }

    public Logarithm(Logarithm a) {
        this.b = a.b;
        this.x = a.x;
    }

    public Logarithm() {
        b = 0;
        x = 0;
    }

    public double myfunc() {
        if (x > 0 || b > 0) {
            return Math.floor((Math.log(x)) / (Math.log(b)));
        } else {
            return 0.0;
        }
    }
}
