class Base {
    public static void main(String[] args) {
        D1 obj1= new D1();
        D2 obj2= new D2();
        D3 obj3= new D3();
        D4 obj4= new D4();
        obj1.main();
        obj2.main("Subhash");
        obj3.main(15);
        obj4.display();
    }
}
class D1 {
    public static void main( ) {
        System.out.println("This is D1 class");
    }
}
class D2{
    public static void main(String name) {
        System.out.println("Hello "+name+" This is D2 class");
    }
}
class D3{
    public static void main(int num) {
        System.out.println("The num is "+num);
    }
}
class  D4{
    void display()
    {
        System.out.println("This is display class");
    }
}