public class Fish extends FoodItem {
    public void setparameter() {
        if (t == "Carp") {
            c = 20;
            z = 15;
        } else if (t == "medium") {
            c = 25;
            z = 20;
        } else if (t == "small") {
            c = 200;
            z = 25;
        }
    }

    public Fish(String t) {
        this.t = t;
    }
}