public class Smartphone extends ElectronicDevice {
    public String model;
    public String operatingSystem;
    private String IMEI;

    public Smartphone(String brand, double price, String model, String operatingSystem, String IMEI) {
        super(brand, price);
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.IMEI = IMEI;
    }

    public void displayInfo() {
        System.out.println(super.brand);
        System.out.println(super.price);
        System.out.println(model);
        System.out.println(operatingSystem);
        //invoking displayInfo from parent class
        super.displayInfo();
    }
//Setting up a getter method to access IMEI later
    public String getIMEI() {
        return IMEI;
    }
}
