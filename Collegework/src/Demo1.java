import java.util.Scanner;
public class Demo1 {
    public static void main(String[] args) {
        int val;
        Scanner inp = new Scanner(System.in);
        System.out.println("Name: Shreasee Ghosh Class Roll No.- 26");
        System.out.println("The Commission is: : ");
        val = inp.nextInt();
        if(val>=0){
            Commission obj = new Commission(val);
            double n = obj.commission();
            if(n>=0)
            {
                System.out.println("The Commission is: "+n);
            }
            else{
                System.out.println("Invalid Input....");
            }
        }
        else {System.out.println("Invalid Input.... ");
        }
    }
}
class Commission {
    int sales;
    Commission(int sa)
    {
        sales = sa;
    }
    double commission()
    {
        return sales * 0.25 ;
    }

}
