public class fun_oddeven
{
    static void Num(int a)
    {
        if(a % 2 == 0)
            System.out.println("Number is Odd");
        else
            System.out.println("Number is Even");
        Num(12);
    }
}
