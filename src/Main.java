import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter a Number: ");
       Scanner inp = new Scanner(System.in);
        num=inp.nextInt();
        for(int i=0;i<=10;++i)
        {
            System.out.println(num+"x"+i+"="+num*i);
        }
    }
}
