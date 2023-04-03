public class Main4
{
    public static void main(String[] args)
    {
        System.out.println("Name: Sayan Mukherjee Roll No. 01");

        Distance obj = new Distance(25);
        obj.travelTime();
        DistanceMKS obj1 = new DistanceMKS(25);
        obj1.travelTime();
    }
}
class Distance
{
    double dist;
    Distance(double dist)
    {
        this.dist = dist*0.62137119;

    }
    void travelTime()
    {
        double time = dist/0.60;
        System.out.println("Time taken to cover the distance: "+time+" Min");
    }
}
class DistanceMKS extends Distance
{
    DistanceMKS(double dist) {
        super(dist);
    }

    void travelTime()
    {
        double time = dist / 100;
        System.out.println("Time taken to cover the distance: "+time+" Min");
    }
}

