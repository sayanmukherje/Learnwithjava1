import java.util.Scanner;
public class HollowSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: Sayan Mukherjee Rollno- 120210040090001");
        System.out.print("Enter the size of the square (between 1 and 20): ");
        int size = scanner.nextInt();

        if (size < 1 || size > 20) {
            System.out.println("Invalid input. The size must be between 1 and 20.");
            return;
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}