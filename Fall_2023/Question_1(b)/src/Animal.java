public class Animal {
    public String color;
    public String name;

    public Animal() {
        System.out.println("Default animal");
        color = "Unknown";
    }

    public void showNameColor() {
        System.out.println("Color is: " + color + " Name is: " + name);
    }

    {
        System.out.println("Animal instance initialization ");
    }
}

