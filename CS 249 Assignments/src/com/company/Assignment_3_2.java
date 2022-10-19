

import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class Assignment_3_2 {
    public static void main (String[] args)
    {
            Scanner scan = new Scanner(System.in);
            Random gen = new Random();
            int a = 0;
            int b = 0;
            int c = 0;
            int sum = 0;
            int answer = 0;
            a = gen.nextInt(10);
            b = gen.nextInt(10);
            c = gen.nextInt(10);
            answer = a + b + c;
            System.out.print("Please input the sum of " + a + " + " + b + " + " + c + ": " );
            sum = scan.nextInt();

            if (sum == answer)
            {
                System.out.println("Correct!");
            }
            else
            {
                System.out.println("Incorrect!");
            }
    }

}
