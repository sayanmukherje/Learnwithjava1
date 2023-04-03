import java.util.Scanner;
public class user_studentdetails {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        Scanner inp = new Scanner(System.in);
        String Name,Address;
        System.out.println("Please enter 1st Student Name and Address: ");
        Name = inp.next();
        Address = inp.next();
        obj1.input(Name,Address);
        System.out.println("Please enter 2nd Student Name and Address: ");
        Name = inp.next();
        Address = inp.next();
        obj2.input(Name,Address);
        obj1.display();
        obj2.display();
    }
}
class Student{
    String Name,Address;
    void input(String nm,String add)
    {
        Name = nm;
        Address = add;
    }
    void display()
    {
        System.out.println("Name: "+Name+" Address: "+Address);
    }
}
