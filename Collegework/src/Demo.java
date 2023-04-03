import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        int val;
        Scanner inp = new Scanner(System.in);
        System.out.println("Name: Sayan Mukherjee  Class Roll No.- 01");
        System.out.println("Please enter number: ");
        val = inp.nextInt();
        if(val>=0 && val<=100){
            Grader obj = new Grader(val);
            char n = obj.LetterGrade();
            System.out.println("Grade: "+n);
        }
        else{
            System.out.println("Marks cannot be negative: ");
        }
    }
}
class Grader{
    int score;
    Grader(int sc)
    {
        score = sc;
    }
    char LetterGrade()
    {
        if(score>90 && score<=100) {
            return 'O';
        } else if (score>80 && score<=90) {
            return 'E';
        } else if (score>70 && score<=80) {
            return 'A';
        } else if (score>60 && score<=70){
            return 'B';
        } else if (score>50 && score<=60) {
            return 'C';
        } else {
            return 'F';
        }
    }
}
