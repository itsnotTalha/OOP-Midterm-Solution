public class PizzaShop {
    private int pizza_price = 320;
    private int drink_price = 40;
    private int fries_price = 100;

    public PizzaShop() {
    }

    public void order(int pizza, int drinks, int fries) {
        int totalPice = (pizza * pizza_price) + (drinks * drink_price) + (fries * fries_price);
        System.out.println("You ordered " + pizza + " pizzas, " + drinks + " drinks, " + fries + " fries");
        System.out.println("Total bill: " + totalPice + " taka");
    }

    public void order(int pizza, int drinks) {
        int totalPice = (pizza * pizza_price) + (drinks * drink_price);
        System.out.println("You ordered " + pizza + " pizzas, " + drinks + " drinks");
        System.out.println("Total bill: " + totalPice + " taka");
    }

    public void order(int pizza) {
        int totalPice = (pizza * pizza_price);
        System.out.println("You ordered " + pizza + " pizzas");
        System.out.println("Total bill: " + totalPice + " taka");
    }

}

class Order {
    public static void main(String[] args) {
        PizzaShop p = new PizzaShop();
        p.order(2, 4);
        p.order(1, 2, 1);
        p.order(3);
    }
}