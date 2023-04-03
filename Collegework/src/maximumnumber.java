import java.util.Scanner;
public class maximumnumber {
    public static void main(String[] args)
    {
        int a, b, c, largest, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        temp=a>b?a:b;
        largest=c>temp?c:temp;
        System.out.println("The largest number is: "+largest);
    }
}