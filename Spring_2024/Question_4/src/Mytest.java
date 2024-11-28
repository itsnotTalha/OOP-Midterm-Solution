public class Mytest {
    public static void main(String[] args) {
        Fish fish  = new Fish("small");
        Vegetable vegetable = new Vegetable("Cauliflower");
        fish.setparameter();
        double fishprice = fish.getprice(3);
        vegetable.setparameter();
        double vegprice = vegetable.getprice(2);
        double totalPrice = fishprice+vegprice;
        System.out.println(totalPrice);
    }
}
