class Vehicle {
    private int numOfWheels;
    private double speed;

    public Vehicle(int numOfWheels, double speed) {
        this.numOfWheels = numOfWheels;
        this.speed = speed;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public double getSpeed() {
        return speed;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}

class Car extends Vehicle {
    private int numOfPassengers;

    public Car(int numOfWheels, double speed, int numOfPassengers) {
        super(numOfWheels, speed);
        this.numOfPassengers = numOfPassengers;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }
}

class Truck extends Vehicle {
    private double loadLimit;

    public Truck(int numOfWheels, double speed, double loadLimit) {
        super(numOfWheels, speed);
        this.loadLimit = loadLimit;
    }

    public double getLoadLimit() {
        return loadLimit;
    }

    public void setLoadLimit(double loadLimit) {
        this.loadLimit = loadLimit;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, 100.0, 5);
        Truck truck = new Truck(6, 80.0, 5000.0);
        System.out.println("Name: Sayan Mukherjee Rollno- 120210040090001");
        System.out.println("Car info:");
        System.out.println("Number of wheels: " + car.getNumOfWheels());
        System.out.println("Speed: " + car.getSpeed());
        System.out.println("Number of passengers: " + car.getNumOfPassengers());

        System.out.println();

        System.out.println("Truck info:");
        System.out.println("Number of wheels: " + truck.getNumOfWheels());
        System.out.println("Speed: " + truck.getSpeed());
        System.out.println("Load limit: " + truck.getLoadLimit());

        System.out.println();

        if (car.getSpeed() > truck.getSpeed()) {
            System.out.println("The car is faster than the truck.");
        } else if (truck.getSpeed() > car.getSpeed()) {
            System.out.println("The truck is faster than the car.");
        } else {
            System.out.println("The car and truck have the same speed.");
        }
    }
}
