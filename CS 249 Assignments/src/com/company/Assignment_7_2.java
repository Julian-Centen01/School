

import java.util.Scanner;
public class Assignment_7_2 {
    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        Scanner scan = new Scanner(System.in);
        int y;

        for (y = 0; y < 10 ; y++)
        {
            System.out.print("Input an integer: ");
            numbers [y] = scan.nextInt();
        }

        for (y = 9; y >= 0; y--)
        {
            System.out.println(numbers[y]);
        }
    }

}
