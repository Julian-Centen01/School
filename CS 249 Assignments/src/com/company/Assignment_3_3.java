
import java.util.Scanner;

public class Assignment_3_3 {
    public static void main (String[] args)
    {
        double a , b , c , d , e , f;
        double x , y , check;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input a:");
        a = scan.nextDouble();
        System.out.println("Please input b:");
        b = scan.nextDouble();
        System.out.println("Please input c:");
        c = scan.nextDouble();
        System.out.println("Please input d:");
        d = scan.nextDouble();
        System.out.println("Please input e:");
        e = scan.nextDouble();
        System.out.println("Please input f:");
        f = scan.nextDouble();

        check = (a * d) - (b * c);

        if (check  == 0)
        {
            System.out.println("The equation has no solution");
        }
        else
        {
            x = (e * d - b * f)/(a * d - b * c);
            y = (a * f - e * c)/(a * d - b * c);
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
