public class Employee {
    public static void main(String[] args) {
        System.out.println("Name: Sayan Mukherjee Roll No. 01");
        Box obj = new Box();
        obj.whooleSerfaceArea(12,14,10);
        obj.volume(17,18,13);
        Cube obj1 = new Cube();
        obj1.whooleSerfaceArea(15);
        obj1.volume(10);
        Cylinder obj2 = new Cylinder();
        obj2.whooleSerfaceArea(15,19);
        obj2.volume(20,21);
        Cone obj3 = new Cone();
        obj3.whooleSerfaceArea(17,11);
        obj3.volume(10,12);
    }
}
class ThreeDObject{
    void whooleSerfaceArea()
    {

    }
    void volume()
    {

    }
}
class Box extends ThreeDObject{
    void whooleSerfaceArea(float h,float w, float l)
    {
        float area = 2 * l * w * l;
        System.out.println("Area of a Boxes: "+area);
    }
    void volume(float h,float w, float l)
    {
        float vol = h * w * l;
        System.out.println("Volume of a Boxes: "+vol);
    }
}
class Cube extends Box{
    void whooleSerfaceArea(float a)
    {
        float area = 6 * (a*a);
        System.out.println("Area of Cude: "+area);
    }
    void volume(float a)
    {
        float vol = (a * a * a);
        System.out.println("Volume of Cube: "+vol);
    }
}
class Cylinder extends Cube{
    void whooleSerfaceArea(float r,float h)
    {
        double area = 2 * 3.14 * r * h + 2 * 3.14 * (r*r);
        System.out.println("Area of Cylinder: "+area);
    }
    void volume(float r,float h)
    {
        double vol = 3.14 * (r*r) * h;
        System.out.println("Volume of Cylinder: "+vol);
    }
}
class Cone extends Cylinder{
    void whooleSerfaceArea(float r,float h)
    {
        double area = r * h;
        System.out.println("Area of Cone: "+area);
    }
    void volume(float r, float h)
    {
        double vol = r * h;
        System.out.println("Volume of Cone: "+vol);
    }
}