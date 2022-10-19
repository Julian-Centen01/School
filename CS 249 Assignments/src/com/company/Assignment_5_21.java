

import java.util.Scanner;
import java.lang.Math;

public class Assignment_5_21 {
    public static void main (String[] args)
    {
        int years;
        double loanhold;
        double loan;
        double total = 0;
        double monthly;
        double months;
        double interest = 5.0;
        double interestnum = 5.0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert loan amount: ");
        loanhold = scan.nextDouble();
        System.out.print("Insert number of years: ");
        years = scan.nextInt();
        months = years * 12;

        System.out.println("Interest Rate          Monthly Payment          Total Payment");
        while (interestnum <= 8)
        {
            loan = loanhold;
            interest = interestnum / 100;
            for (int x = 0; x < years; x++)
                loan = loan * (interest + 1);
            monthly = loan / months;

            System.out.println(interestnum + "%         " + monthly + "          " + loan);
            interestnum = interestnum + 0.125;
        }
    }
}
