import java.util.Scanner;
public class LargestNumberFinder {
    public static void main(String[] args) {
        System.out.println("Name: Shreasee Ghosh Rollno- 12021004009026");
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int largest = Integer.MIN_VALUE;

        while (counter <= 10) {
            System.out.print("Enter number " + counter + ": ");
            int number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.println("The largest number is: " + largest);
    }
}