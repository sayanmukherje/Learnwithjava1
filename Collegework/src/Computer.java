import java.util.Scanner;
public class Computer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: Shreasee Ghosh Rollno- 120210040090026");
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        double e = 0;
        double factorial = 1;
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                factorial *= i;
            }

            e += 1.0 / factorial;
        }

        System.out.println("The value of e is: " + e);
    }
}