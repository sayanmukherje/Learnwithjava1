public class Vehicle1{
    public static void main(String[] args) {
        System.out.println();
    }
}
class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String colour;
    protected String ownerName;

    public void showData() {
        System.out.println("This is a vehicle class.");
    }
}

class Bus extends Vehicle1 {
    private String routeNumber;

    public Bus(String regnNumber, int speed, String colour, String ownerName, String routeNumber) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.colour = colour;
        this.ownerName = ownerName;
        this.routeNumber = routeNumber;
    }

    public void showData() {
        super.showData();
        System.out.println("Bus Registration Number: " + regnNumber);
        System.out.println("Bus Speed: " + speed);
        System.out.println("Bus Colour: " + colour);
        System.out.println("Bus Owner Name: " + ownerName);
        System.out.println("Bus Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String colour, String ownerName, String manufacturerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.colour = colour;
        this.ownerName = ownerName;
        this.manufacturerName = manufacturerName;
    }

    public void showData() {
        super.showData();
        System.out.println("Car Registration Number: " + regnNumber);
        System.out.println("Car Speed: " + speed);
        System.out.println("Car Colour: " + colour);
        System.out.println("Car Owner Name: " + ownerName);
        System.out.println("Car Manufacturer Name: " + manufacturerName);
    }
}