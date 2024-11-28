public class Vegetable extends FoodItem {
    public void setparameter() {
        if (t == "Spinach") {
            c = 20;
            z = 15;
        } else if (t == "Cauliflower") {
            c = 25;
            z = 18;
        }
    }

    public Vegetable(String t) {
        this.t = t;
    }
}