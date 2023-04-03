public class Diffenent
{
    public static void main(String[] args) {
                int x = 5;
                int y = 6;
                int sum = x + y;
                System.out.println(sum);
            }
    public class Reverse
    {
    public void main(String[] args)
    {
        int number = 987654, reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}
    public class count
    {
        public void main(String[] args) {
            int count = 0, num = 865793;

            while (num != 0)
            {
                num /= 10;
                ++count;
            }

            System.out.println("Number of digits: " + count);
        }
    }
    public class different
    {
        public void main(String[] args) {
            System.out.println("Different Classes...");
        }
    }
}



