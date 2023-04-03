import java.util.Scanner;
public class arithmetic
{
    public static void main(String[] args) {
        int a,b,s;
        System.out.println("1.Sum\n2.Sub\n3.Multi\n4.Div\n");
        Scanner inp = new Scanner(System.in);
        System.out.println("Take a option: ");
        s = inp.nextInt();
        System.out.println("Enter two number: ");
        a = inp.nextInt();
        b = inp.nextInt();
        switch (s)
        {
            case 1:
                System.out.println("Sum: "+(a+b));
                break;
            case 2:
                System.out.println("Sub: "+(a-b));
                break;
            case 3:
                System.out.println("Multi: "+(a*b));
                break;
            case 4:
                System.out.println("Div: "+(a/b));
            default:
                System.out.println("Exit.............");
        }
    }
}
