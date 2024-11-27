public class Mytest {
    public static void main(String[] args) {
        Myparent c1, c2;
        c1 = new Mychild(2);
        c2 = new Mychild();
        c2.set_p(2);
        int x = c2.myfunction();
        double y = ((Mychild) c1).myroot(); // find square root of p in class Myparent
        System.out.println("x = " + x + ", y = " + y);
    }
}