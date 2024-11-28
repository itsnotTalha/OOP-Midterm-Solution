public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car("make001", "model001", 4);
        car1.drive();
        //fixed here by adding cast qualifier
        ((Car) car1).honk();
    }
}