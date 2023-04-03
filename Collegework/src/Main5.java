public class Main5 {
    public static void main(String[] args) {
        System.out.println("Name: Sayan Mukherjee Roll No. 01");
        vehicle obj = new vehicle();
        obj.input(8,100);
        obj.display();
        Car1 obj1 = new Car1();
        obj1.input(4,20);
        truck obj2 = new truck();
        obj2.input(8,40);
        obj2.display();
        int diff = obj2.speed-obj1.speed;
        System.out.println("Compare the speed of two vehicles: "+diff);
    }
}
class vehicle{
    int numofwheels;
    int speed;
    void input(int wheels, int sp)
    {
        numofwheels = wheels;
        speed = sp;
    }
    void display()
    {
        System.out.println("Numer of wheels: "+numofwheels);
        System.out.println("Speed: "+speed);
    }
}
class Car1 extends vehicle{
    int numofpassengers;
    void input ( int passenger)
    {
        numofpassengers = passenger;
    }
    void display()
    {
        System.out.println("Number of passengers: "+numofpassengers);
    }
}
class truck extends vehicle{
    int loadlimit;
    void input(int limit)
    {
        loadlimit = limit;
    }
    void display()
    {
        System.out.println("Store the load limit: "+loadlimit);
    }
}