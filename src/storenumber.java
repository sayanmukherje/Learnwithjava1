import java.util.Scanner;

public class storenumber
{
    public static void main(String[] args) {
        int size;
        int sum=0;
        System.out.println("Enter a required size of array: ");
        Scanner inp = new Scanner(System.in);
        size = inp.nextInt();
        int[] store = new int[size];
        System.out.println("Enter a number: ");
        for(int i =0;i<size;i++)
        {
            store[i] = inp.nextInt();
        }
        System.out.println("Sum of all element: ");
        for(int i =0;i<size;i++)
        {
            sum = sum+store[i];
        }
        System.out.println("The sum is: "+sum);
    }
}
