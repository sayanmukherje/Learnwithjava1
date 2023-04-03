import java.util.Scanner;
public class performancemarks
{
    public static void main(String[] args) {
        int marks;
        String prformance;
        Scanner inp = new  Scanner(System.in);
        System.out.println("Name: Sayan Mukherjee ");
        System.out.println("Enter a number: ");
        marks=inp.nextInt();
        if(marks<50)
        {
            System.out.println("Fair");
        }
        else if(marks>=50 && marks<75)
        {
            System.out.println("Good");
        }
        else if(marks>=75 && marks<85)
        {
            System.out.println("Very Good");
        }
        else if(marks>=85)
        {
            System.out.println("Excellent");
        }
    }
}
