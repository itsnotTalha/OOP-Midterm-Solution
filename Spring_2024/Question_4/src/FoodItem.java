public class FoodItem {
    public double c,z;
    public String t;

    public double getprice(double amount){
        return c*amount*(1+z/100);
    }
}
