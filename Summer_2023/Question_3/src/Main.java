public class Main {
    public static void main(String[] args) {
        //making 5 object using array
        Myobject[] myObj = new Myobject[5];
        myObj[0] = new Sphere(2.5);
        myObj[1] = new Cone(1.9, 8.9);
        myObj[2] = new Cylinder(1.5, 6.5);
        myObj[3] = new Cone(2.7, 5.7);
        myObj[4] = new Sphere(3.5);
        double sum = 0.0;
        for (int i = 0; i < 5; i++) {
            sum += myObj[i].findVolume();
        }
        System.out.println("Total Vol: " + sum);
    }
}