
import java.util.Scanner;

public class Assignment_3_5 {
    public static void main (String[] args)
    {
        int day, future;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter today's day (1-7): ");
        day = scan.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        future = scan.nextInt();

        future = (future + day) % 7;

        System.out.print("Today is ");
        switch (day)
        {
            case 1:
            {
                System.out.print("Sunday ");
                break;
            }
            case 2:
            {
                System.out.print("Monday ");
                break;
            }
            case 3:
            {
                System.out.print("Tuesday ");
                break;
            }
            case 4:
            {
                System.out.print("Wednesday ");
                break;
            }
            case 5:
            {
                System.out.print("Thursday ");
                break;
            }
            case 6:
            {
                System.out.print("Friday ");
                break;
            }
            default:
            {
                System.out.print("Saturday ");
            }
        }
        System.out.print("and the future day is ");
        switch (future)
        {
            case 1: {
                System.out.print("Sunday ");
                break;
            }
            case 2: {
                System.out.print("Monday ");
                break;
            }
            case 3: {
                System.out.print("Tuesday ");
                break;
            }
            case 4: {
                System.out.print("Wednesday ");
                break;
            }
            case 5: {
                System.out.print("Thursday ");
                break;
            }
            case 6: {
                System.out.print("Friday ");
                break;
            }
            default: {
                System.out.print("Saturday ");
            }
        }
    }
}
