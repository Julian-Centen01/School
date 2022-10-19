

import java.util.Scanner;
public class Assignment_7_3 {
    public static void main(String[] args)
    {
        int[] numbers = new int[101];
        int y = 0;
        boolean zero = false;
        Scanner scan = new Scanner(System.in);

        for (y = 0; y < 101; y ++)
            numbers[y] = 0;
        while (!zero)
        {
            System.out.println("Insert a number between 1-100, or 0 to end inputs");
            y = scan.nextInt();
            if (y != 0)
                numbers[y] ++;
            else
                zero = true;

        }
        for (y = 0; y < 101; y ++)
        {
            if (y != 0 && numbers[y] != 0 && numbers[y] == 1)
                System.out.println(y + " has occurred " + numbers[y] + " time");
            else if (y != 0 && numbers[y] != 0 && numbers[y] > 1)
                System.out.println(y + " has occurred " + numbers[y] + " times");
        }


    }
}
