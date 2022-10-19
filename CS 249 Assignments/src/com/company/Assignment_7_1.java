

import java.util.Scanner;
public class Assignment_7_1 {
    public static void main(String[] args)
    {
        int queue;
        int numhold = 0;
        int y;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students: ");

        queue = scan.nextInt();

        int[] grades = new int[queue];

        for (y = 0; y < queue; y++)
        {
            System.out.print("Enter grade for student " + y + ":");
            grades [y] = scan.nextInt();
        }
        for (y = 0; y < queue; y++)
        {
            if (grades [y] > numhold)
                numhold = grades[y];
        }
        for (y = 0; y < queue; y++)
        {
            if (grades[y] < numhold - 40)
                System.out.println("Student " + y + "'s score is " + grades[y] + ", grade of F");
            else if (grades[y] < numhold - 30)
                System.out.println("Student " + y + "'s score is " + grades[y] + ", grade of D");
            else if (grades[y] < numhold - 20)
                System.out.println("Student " + y + "'s score is " + grades[y] + ", grade of C");
            else if (grades[y] < numhold - 10)
                System.out.println("Student " + y + "'s score is " + grades[y] + ", grade of B");
            else
                System.out.println("Student " + y + "'s score is " + grades[y] + ", grade of A");
        }


    }
}

