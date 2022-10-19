

import java.util.Scanner;
public class Assignment_6_2 {
    public static void main(String[] args)
    {
        int num = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert a number: ");
        num = scan.nextInt();

        num = sumDigits(num);
        System.out.print("Sum of all digits = " + num);

    }
    public static int sumDigits (int n)
    {
       int numHold = n;
       int digit = 0;
       int sum = 0;

       while (numHold != 0)
       {
           digit = numHold % 10;
           numHold = numHold / 10;
           sum = sum + digit;
       }

        return sum;
    }
}
