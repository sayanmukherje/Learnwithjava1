public class Main1{
    public static void main(String[] args) {
        System.out.println("Name: Sayan Mukherjee Roll No. 01");
        Building obj = new Building();
        obj.input(12,10,40);
        obj.display();
        House obj1 = new House();
        obj1.input(4,2);
        obj1.display();
    }
}
class Building {
    int numberoffloors;
    int numberofrooms;
    int totalfootage;

    void input(int floors,int rooms,int footage)
    {
        numberoffloors = floors;
        numberofrooms = rooms;
        totalfootage = footage;
    }
    void display()
    {
        System.out.println("Number of Floors: "+numberoffloors);
        System.out.println("Number of Rooms:"+numberofrooms);
        System.out.println("Total footage:"+totalfootage);
    }
}
class House extends Building{
    int numberofbedrooms;
    int numberofbathrooms;
    void input(int Bathroom, int Bedrooms)
    {
        numberofbedrooms = Bedrooms;
        numberofbathrooms = Bathroom;
    }
    void display()
    {
        System.out.println("Number of Bathrooms: "+numberofbathrooms);
        System.out.println("Number of Bedrooms: "+numberofbedrooms);
    }
}