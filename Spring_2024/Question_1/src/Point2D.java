class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Point2D constructor");
    }

    public String Display() {
        return "x = "+x+", y = "+y;
    }
}

class Point3D extends Point2D{
    int z;
    public Point3D(int x, int y, int z){
        super(x,y);
        this.z=z;
    }
    public String Display(){
        return super.Display()+",z = "+ this.z;
    }
}
