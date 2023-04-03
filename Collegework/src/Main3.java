public class Main3{
    public static void main(String[] args) {
        System.out.println("Name: Sayan Mukherjee Roll No. 01");
        Building1 obj = new Building1();
        obj.input(12,10,40);
        obj.display();
        House1 obj1 = new House1();
        obj1.input(4,2);
        obj1.display();
        Office obj2 = new Office();
        obj2.input(5,2);
        obj2.display();
    }
}
class Building1 {
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
class House1 extends Building{
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
class Office extends House1{
    int numoftelephons;
    int numoftables;
    void input(int tele,int tab)
    {
        numoftelephons = tele;
        numoftables = tab;
    }
    void display()
    {
        System.out.println("Number of telephone: "+numoftelephons);
        System.out.println("Number of tables: "+numoftables);
    }
}