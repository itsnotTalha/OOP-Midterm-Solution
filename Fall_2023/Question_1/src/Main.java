public class Main {
    public static void main(String[] args) {
        Logarithm log1 = new Logarithm(2, 9);
        Logarithm log2 = new Logarithm(log1);
        Logarithm log3 = new Logarithm();
        System.out.println(log1.b + " " + log1.x + " " + log1.myfunc());
        System.out.println(log2.b + " " + log2.x + " " + log2.myfunc());
        System.out.println(log3.b + " " + log3.x + " " + log3.myfunc());
    }
}